package com.rajeshDyadav.file.xml;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class InputExcel01 {
    public static void main(String[] args) throws IOException {
	String xmlFilePath = "/raj/backup/EclipseWorkspace/QMS/raj7749/raj7749/src/com/rajeshDyadav/file/xml/ColumnNames.xml";
	String inputFilePath = "/raj/test1.xls";
	String outputFilePath = "/raj/raj_";
	int columnRowNo = 1;

	InputExcel01 rajExcelTest01 = new InputExcel01();
	rajExcelTest01.excelOperation(xmlFilePath, inputFilePath, outputFilePath, columnRowNo);
    }

    public String excelOperation(String xmlFilePath, String inputFilePath, String outputFilePath, int columnRowNo) {
	String status = "";
	try {
	    status = "Please Wait!!! This May Take Time..";
	    FileInputStream myInput = new FileInputStream(inputFilePath);
	    POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);
	    HSSFWorkbook myWorkBook = new HSSFWorkbook(myFileSystem);
	    HSSFSheet mySheet = myWorkBook.getSheetAt(0);
	    @SuppressWarnings("rawtypes")
	    Iterator rowIter = mySheet.rowIterator();

	    ArrayList<String> listColumnNames = new ArrayList<String>();
	    ArrayList<String> listColumnValues = new ArrayList<String>();

	    XmlParser01 xmlParser01 = new XmlParser01();
	    ArrayList<String> listColumnNamesXml = xmlParser01.getColumnsListFromXml(xmlFilePath);

	    //OutputWithXSSF01 outputWithXSSF01 = new OutputWithXSSF01();
	    //outputWithXSSF01.createWorkbook();
	    OutputWithText01 outputWithText01 = new OutputWithText01();

	    ArrayList<String> listColumnNames2 = new ArrayList<String>();
	    ArrayList<String> listColumnValues2 = new ArrayList<String>();
	    int i, j;

	    HSSFRow myRow;
	    @SuppressWarnings("rawtypes")
	    Iterator cellIter;

	    while (rowIter.hasNext()) {		
		myRow = (HSSFRow) rowIter.next();
		if (myRow.getRowNum() == columnRowNo) {		    
		    /*
		     * this condition gets the row of the column names from the
		     * excel file
		     */
		    listColumnNames2.clear();
		    cellIter = myRow.cellIterator();
		    while (cellIter.hasNext()) {
			listColumnNames.add(cellIter.next().toString());
		    }
		    cellIter = null;

		    i = 0;
		    while (i < listColumnNamesXml.size()) {
			j = 0;
			while (j < listColumnNames.size()) {
			    if (listColumnNamesXml.get(i).equalsIgnoreCase(listColumnNames.get(j))) {
				listColumnNames2.add(listColumnNamesXml.get(i));
				break;
			    }
			    j++;
			}
			i++;
		    }
		    
		    /* get the remaining columns */
		    if (listColumnNamesXml.size() != listColumnNames2.size()) {
			i = 0;
			while (i < listColumnNamesXml.size()) {
			    if (!listColumnNames2.contains(listColumnNamesXml.get(i))) {		    
				listColumnNames2.add(listColumnNamesXml.get(i));
			    }
			    i++;
			}			
		    }
		    //outputWithXSSF01.writeRow(listColumnNames2);
		    outputWithText01.writeRow(outputFilePath,false,listColumnNames2);
		} else if ((myRow.getRowNum() > columnRowNo)) {
		    /* actual data as row against the column obtained before */
		    cellIter = myRow.cellIterator();
		    listColumnValues.clear();		    
		    while (cellIter.hasNext()) {
			listColumnValues.add(cellIter.next().toString());
		    }
		    cellIter = null;

		    i = 0;
		    listColumnValues2.clear();
		    while (i < listColumnNamesXml.size()) {
			j = 0;
			while (j < listColumnNames.size()) {
			    if (listColumnNamesXml.get(i).equalsIgnoreCase(listColumnNames.get(j))) {
				listColumnValues2.add(listColumnValues.get(j));
				break;
			    }
			    j++;
			}
			i++;
		    }
		    //outputWithXSSF01.writeRow(listColumnValues2);
		    outputWithText01.writeRow(outputFilePath,true,listColumnValues2);
		}
	    }

	    /*
	    if (outputWithXSSF01.closeWorkbook(outputFilePath)) {
		System.out.println("New File Successfully Created at location ..> " + outputFilePath);
		status = "New File Successfully Created";
	    } else {
		System.out.println("!!! Error Occurred, Try Different Output File Location !!!");
		status = "!!! Error Occurred, Try Different Output File Location !!!";
	    }
	    */
	    status = "Done :):):):):)";
	} catch (Exception e) {
	    status = "!!! Error Occurred, Try Different Output File Location !!!";
	    e.printStackTrace();
	}
	return status;
    }    
}