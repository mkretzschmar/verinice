/*******************************************************************************
 * Copyright (c) 2014 Sebastian Hagedorn <sh@sernet.de>.
 * This program is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License 
 * as published by the Free Software Foundation, either version 3 
 * of the License, or (at your option) any later version.
 *     This program is distributed in the hope that it will be useful,    
 * but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU General Public License for more details.
 *     You should have received a copy of the GNU General Public 
 * License along with this program. 
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Sebastian Hagedorn <sh@sernet.de> - initial API and implementation
 ******************************************************************************/
package sernet.verinice.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.core.io.Resource;

import sernet.gs.service.ReportTemplateUtil;
import sernet.verinice.interfaces.IReportDepositService;
import sernet.verinice.interfaces.report.IOutputFormat;
import sernet.verinice.model.report.ExcelOutputFormat;
import sernet.verinice.model.report.HTMLOutputFormat;
import sernet.verinice.model.report.ODSOutputFormat;
import sernet.verinice.model.report.ODTOutputFormat;
import sernet.verinice.model.report.PDFOutputFormat;
import sernet.verinice.model.report.PropertyFileExistsException;
import sernet.verinice.model.report.ReportMetaDataException;
import sernet.verinice.model.report.ReportTemplate;
import sernet.verinice.model.report.ReportTemplateMetaData;
import sernet.verinice.model.report.WordOutputFormat;

/**
 *
 */
public class ReportDepositService implements IReportDepositService {

    private static final Logger LOG = Logger.getLogger(ReportDepositService.class);

    private Resource reportDeposit;

    private ReportTemplateUtil reportTemplateUtil;

    private ReportDepositService() {
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * sernet.verinice.interfaces.report.IReportService#getOutputFormat(java
     * .lang.String)
     */
    public IOutputFormat getOutputFormat(OutputFormat formatLabel) {
        switch(formatLabel){
            case PDF: return new PDFOutputFormat();
            case HTML: return new HTMLOutputFormat();
            case ODS: return new ODSOutputFormat();
            case ODT: return new ODTOutputFormat();
            case XLS: return new ExcelOutputFormat();
            case DOC: return new WordOutputFormat();
            default: return null;
        }

    }

    public IOutputFormat[] getOutputFormats(OutputFormat[] formatLabel) {
        List<IOutputFormat> list = new ArrayList<IOutputFormat>(formatLabel.length);
        for (OutputFormat s : formatLabel) {
            IOutputFormat format = getOutputFormat(s);
            if (format != null) {
                list.add(format);
            } else {
                LOG.warn("Report output format:\t" + s + " not available in verinice");
            }
        }
        return list.toArray(new IOutputFormat[list.size()]);
    }

    @Override
    public Set<ReportTemplateMetaData> getReportTemplates(String[] rptDesignFiles, String locale) throws IOException, ReportMetaDataException, PropertyFileExistsException {
        return getReportTemplateUtil().getReportTemplates(rptDesignFiles, locale);
    }

    @Override
    public Set<ReportTemplateMetaData> getServerReportTemplates(String locale) throws IOException, ReportMetaDataException, PropertyFileExistsException {
        return getReportTemplates(getServerRptDesigns(), locale);
    }

    @SuppressWarnings("unchecked")
    private String[] getServerRptDesigns() throws IOException {
        List<String> list = new ArrayList<String>(0);
        // // DirFilter = null means no subdirectories
        IOFileFilter filter = new SuffixFileFilter("rptdesign", IOCase.INSENSITIVE);
        Iterator<File> iter = FileUtils.iterateFiles(getReportDeposit().getFile(), filter, null);
        while (iter.hasNext()) {
            list.add(iter.next().getAbsolutePath());
        }
        return list.toArray(new String[list.size()]);
    }

    @Override
    public void addToServerDeposit(ReportTemplateMetaData metadata, byte[] file, String locale) throws IOException {
        if("en".equals(locale.toLowerCase())){
            locale = ""; 
         } else {
             locale = "_" + locale.toLowerCase();
         }
        String filename = metadata.getFilename();
        filename = filename.substring(filename.lastIndexOf(File.separatorChar) + 1);
        File serverDepositPath;      
        serverDepositPath = getReportDeposit().getFile();
        String newFilePath = serverDepositPath.getPath() + File.separatorChar + filename;
        String propFilePath = filename.substring(0, filename.lastIndexOf(IReportDepositService.EXTENSION_SEPARATOR_CHAR)) + locale 
                +IReportDepositService.EXTENSION_SEPARATOR_CHAR
                +IReportDepositService.PROPERTIES_FILE_EXTENSION;
        FileUtils.writeByteArrayToFile(new File(newFilePath), file);     
        writePropertiesFile(convertToProperties(metadata), propFilePath, "");
    }

    @Override
    public void removeFromServer(ReportTemplateMetaData metadata, String locale) throws IOException {
        if("en".equals(locale.toLowerCase())){
            locale = ""; 
         } else {
             locale = "_" + locale.toLowerCase();
         }
        String filename = metadata.getFilename();
        filename = filename.substring(0, filename.lastIndexOf(IReportDepositService.EXTENSION_SEPARATOR_CHAR));
        filename = filename + locale + IReportDepositService.EXTENSION_SEPARATOR_CHAR + IReportDepositService.PROPERTIES_FILE_EXTENSION;
        File depositDir = getReportDeposit().getFile();
        File propFile = new File(depositDir, filename);
        if (propFile.exists()) {
            FileUtils.deleteQuietly(propFile);
        }
        File rptFile = new File(depositDir, metadata.getFilename());
        if (rptFile.exists()) {
            FileUtils.deleteQuietly(rptFile);
        }
    }

    public Resource getReportDeposit() {
        return reportDeposit;
    }

    public void setReportDeposit(Resource reportDeposit) {
        this.reportDeposit = reportDeposit;
    }

    private ReportTemplateUtil getReportTemplateUtil() throws IOException {
        if (reportTemplateUtil == null) {
            reportTemplateUtil = new ReportTemplateUtil(reportDeposit.getFile().getPath(), true);
        }

        return reportTemplateUtil;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * sernet.verinice.interfaces.IReportDepositService#getDepositLocation()
     */
    @Override
    public String getDepositLocation() throws IOException {
        if (getReportDeposit() != null) {
            return getReportDeposit().getFile().getAbsolutePath();
        }
        return "";
    }

    @Override
    public void updateInServerDeposit(ReportTemplateMetaData metadata, String locale) throws IOException {
        String filename = metadata.getFilename();
        if(filename.contains(String.valueOf(File.separatorChar))){
            filename = filename.substring(filename.lastIndexOf(File.separatorChar) + 1);
        }
        if (getReportTemplateUtil().checkReportMetaDataFile(new File(metadata.getFilename()), locale)) {
            File propFile = getReportTemplateUtil().getPropertiesFile(metadata.getFilename(), locale);
            Properties props = getReportTemplateUtil().parseAndExtendMetaData(propFile, locale);
            props.setProperty(PROPERTIES_OUTPUTFORMATS, StringUtils.join(metadata.getOutputFormats(), ','));
            props.setProperty(PROPERTIES_OUTPUTNAME, metadata.getOutputname());
            writePropertiesFile(props, propFile.getName(), "");

        } else {
            writePropertiesFile(convertToProperties(metadata), getReportTemplateUtil().getPropertiesFile(metadata.getFilename(), locale).getName(), "Default Properties for verinice-" + "Report " + metadata.getOutputname() + "\nauto-generated content");
        }
    }

    private void writePropertiesFile(Properties properties, String name, String comment) throws IOException {
        String newFilePath = getReportDeposit().getFile().getPath() + File.separatorChar + name;
        newFilePath = ensurePropertiesExtension(newFilePath);
        FileOutputStream fos = new FileOutputStream(newFilePath);
        properties.store(fos, comment);
        fos.close();
    }

    private Properties convertToProperties(ReportTemplateMetaData metaData) {
        Properties props = new Properties();
        props.setProperty(PROPERTIES_OUTPUTFORMATS, StringUtils.join(metaData.getOutputFormats(), ','));
        props.setProperty(PROPERTIES_OUTPUTNAME, metaData.getOutputname());
        props.setProperty(PROPERTIES_FILENAME, metaData.getFilename());
        return props;
    }

    private ReportTemplateMetaData convertToReportTemplateMetadata(Properties props) {
        // return new
        // ReportTemplateMetaData(props.getProperty(IReportDepositService.PROPERTIES_FILENAME),
        // props.getProperty(IReportDepositService.PROPERTIES_OUTPUTNAME),
        // props.getProperty(IReportDepositService.PROPERTIES_OUTPUTFORMATS));
        return null;
    }

    @Override
    public ReportTemplate getReportTemplate(ReportTemplateMetaData metadata, String locale) throws IOException {
        String filePath = getReportDeposit().getFile().getPath() + File.separatorChar + metadata.getFilename();
        byte[] rptdesign = FileUtils.readFileToByteArray(new File(filePath));

        Map<String, byte[]> propertiesFile = getReportTemplateUtil().getPropertiesFiles(metadata.getFilename());
        return new ReportTemplate(metadata, rptdesign, propertiesFile);
    }

    @Override
    public ReportTemplateMetaData getMetaData(File rptDesign, String locale) throws IOException, ReportMetaDataException, PropertyFileExistsException {
        return getReportTemplateUtil().getMetaData(rptDesign, locale);
    }
    
    private String ensurePropertiesExtension(String filename){
        if(filename.contains(String.valueOf('.'))){
            filename = filename.substring(0, filename.lastIndexOf('.') + 1);
        }
        return filename + IReportDepositService.PROPERTIES_FILE_EXTENSION;
    }
}