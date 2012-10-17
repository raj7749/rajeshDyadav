package com.rajeshDyadav.file.xml;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OutputWithXSSF01 {
    private Workbook wb;
    private Sheet sheet;
    private Row row;
    private int lastRow = 0;

    public void createWorkbook() {
	wb = new XSSFWorkbook();
	sheet = wb.createSheet("new sheet");
    }

    public void writeRow(ArrayList<String> rowList) {
	row = sheet.createRow(lastRow++);
	int i = 0;
	while (i < rowList.size()) {
	    row.createCell(i).setCellValue(rowList.get(i));
	    i++;
	}
    }

    public boolean closeWorkbook(String outputFilePath) {
	boolean status = true;
	try {
	    FileOutputStream fileOut = new FileOutputStream(outputFilePath);
	    wb.write(fileOut);
	    fileOut.close();
	} catch (Exception e) {
	    status = false;
	    e.printStackTrace();
	}
	return (status);
    }
}