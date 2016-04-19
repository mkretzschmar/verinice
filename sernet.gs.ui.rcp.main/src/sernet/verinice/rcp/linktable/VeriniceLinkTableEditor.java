/*******************************************************************************
 * Copyright (c) 2016 Daniel Murygin <dm{a}sernet{dot}de>.
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *     Daniel Murygin <dm{a}sernet{dot}de> - initial API and implementation
 ******************************************************************************/
package sernet.verinice.rcp.linktable;

import java.io.File;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.*;
import org.eclipse.ui.part.EditorPart;

import sernet.gs.ui.rcp.main.Activator;
import sernet.gs.ui.rcp.main.service.ServiceFactory;
import sernet.verinice.iso27k.rcp.*;
import sernet.verinice.rcp.linktable.composite.VeriniceLinkTableComposite;
import sernet.verinice.rcp.linktable.composite.VeriniceLinkTableFieldListener;
import sernet.verinice.service.csv.CsvExport;
import sernet.verinice.service.csv.ICsvExport;
import sernet.verinice.service.linktable.LinkTableService;
import sernet.verinice.service.linktable.vlt.VeriniceLinkTable;
import sernet.verinice.service.linktable.vlt.VeriniceLinkTableIO;

/**
 *
 *
 * @author Daniel Murygin <dm{a}sernet{dot}de>
 */
public class VeriniceLinkTableEditor extends EditorPart {

    public static final String EDITOR_ID = VeriniceLinkTableEditor.class.getName();

    private VeriniceLinkTable veriniceLinkTable;
    private LinkTableService linkTableService = new LinkTableService();
    private ICsvExport csvExportHandler = new CsvExport();
    private boolean isDirty = false;

    private VeriniceLinkTableFieldListener contentObserver;

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
     */
    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        if (! (input instanceof VeriniceLinkTableEditorInput)) {
            throw new PartInitException("Input is not an instance of " + VeriniceLinkTableEditorInput.class.getSimpleName());
        }

        VeriniceLinkTableEditorInput vltEditorInput = (VeriniceLinkTableEditorInput) input;
        veriniceLinkTable=vltEditorInput.getInput();

        setSite(site);
        setInput(vltEditorInput);
        setPartName(veriniceLinkTable.getName());
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createPartControl(Composite parent) {
        Activator.inheritVeriniceContextState();
        Composite container = new Composite(parent, SWT.NONE);

        Button exportButton = new Button(container, SWT.PUSH);
        exportButton.setText("Run Query (CSV)...");
        exportButton.setToolTipText("Export data after this link table query to a CSV file");
        GridDataFactory.swtDefaults().align(SWT.RIGHT, SWT.TOP).applyTo(exportButton);
        exportButton.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                exportToCsv();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                widgetSelected(e);
            }
        });

        VeriniceLinkTableComposite ltr = new VeriniceLinkTableComposite(veriniceLinkTable,
                ServiceFactory.lookupObjectModelService(),
                container,
                SWT.NONE);

        contentObserver = new VeriniceLinkTableFieldListener() {

            @Override
            public void fieldValueChanged() {
                isDirty = true;
                firePropertyChange(IEditorPart.PROP_DIRTY);

            }
        };
        ltr.addListener(contentObserver);

        GridLayoutFactory.swtDefaults().applyTo(ltr);
        GridLayoutFactory.swtDefaults().generateLayout(container);
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public void doSave(IProgressMonitor monitor) {
        String filePath = getFilePath(veriniceLinkTable);
        if (filePath != null) {
            executeSave(filePath);
        }
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#doSaveAs()
     */
    @Override
    public void doSaveAs() {
        executeSave(VeriniceLinkTableUtil.createVltFilePath(Display.getCurrent().getActiveShell(),
                "Save query to .vlt file"));
    }
    
    private void executeSave(String filePath) {
        VeriniceLinkTableIO.write(veriniceLinkTable, filePath);
        isDirty = false;
        firePropertyChange(IEditorPart.PROP_DIRTY);
    }

    private String getFilePath(VeriniceLinkTable veriniceLinkTable) { 
        String filePath = LinkTableFileRegistry.getFilePath(veriniceLinkTable.getId());
        if(filePath==null) {
            filePath = VeriniceLinkTableUtil.createVltFilePath(
                    Display.getCurrent().getActiveShell(), "Save query to .vlt file");
            veriniceLinkTable.setName(new File(filePath).getName());
            setPartName(veriniceLinkTable.getName());
            LinkTableFileRegistry.add(veriniceLinkTable.getId(),filePath);
        }
        return filePath;
    }  

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#isDirty()
     */
    @Override
    public boolean isDirty() {
        return isDirty;
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
     */
    @Override
    public boolean isSaveAsAllowed() {
        return true;
    }

    private void exportToCsv() {

        String filePath = VeriniceLinkTableUtil.createCsvFilePath(
                Display.getCurrent().getActiveShell(),
                "Export link table to CSV (.csv) table");
        if (filePath == null) {
            return;
        }
        csvExportHandler.setFilePath(filePath);

        VeriniceWorkspaceJob exportJob = new VeriniceWorkspaceJob("Exporting...", "Error while exporting data.") {

            @Override
            protected void doRunInWorkspace() {

                Activator.inheritVeriniceContextState();
                List<List<String>> table = linkTableService
                        .createTable(VeriniceLinkTableIO
                                .createLinkTableConfiguration(veriniceLinkTable));

                csvExportHandler.exportToFile(csvExportHandler.convert(table));

            }
        };
        JobScheduler.scheduleJob(exportJob, new Mutex());
    }


    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
     */
    @Override
    public void setFocus() {
        // nothing to do

    }

}
