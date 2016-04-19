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

import org.eclipse.swt.widgets.Display;

import sernet.verinice.service.linktable.vlt.VeriniceLinkTable;
import sernet.verinice.service.linktable.vlt.VeriniceLinkTableIO;

/**
 *
 *
 * @author Daniel Murygin <dm{a}sernet{dot}de>
 */
public class OpenLinkTableHandler extends LinkTableHandler {
    
    public OpenLinkTableHandler() {
        super();
    }

    @Override
    protected VeriniceLinkTable createLinkTable() {
        final String filePath = VeriniceLinkTableUtil.createVltFilePath(
                Display.getCurrent().getActiveShell(), "Load verinice link table (.vlt) file");
        VeriniceLinkTable veriniceLinkTable = null;
        if (filePath != null) {
            veriniceLinkTable = VeriniceLinkTableIO.read(filePath);
            LinkTableFileRegistry.add(veriniceLinkTable.getId(), filePath);
        }
        return veriniceLinkTable;
    }
}
