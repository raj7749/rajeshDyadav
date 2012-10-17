package com.rajeshDyadav.file.xml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class OutputWithText01 {
    
    public static void main(String args[]) throws IOException {
	OutputWithText01 test = new OutputWithText01();
	ArrayList<String> arrayList = new ArrayList<String>();
	arrayList.add("COLUMN1");arrayList.add("COLUMN2");arrayList.add("COLUMN3");arrayList.add("COLUMN4");	
	test.writeRow("/raj/raj.txt", false, arrayList);	
	arrayList.clear();
	arrayList.add("VAL1");arrayList.add("VAL2");arrayList.add("VAL3");arrayList.add("VAL4");
	test.writeRow("/raj/raj.txt", true, arrayList);
    }    

    private void appendIntoFile(String fileName, Boolean fileCreateFlag, StringBuilder buffer) throws IOException {
	File file = new File(fileName);
	FileWriter fileWriter = new FileWriter(file, fileCreateFlag);
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	if(fileCreateFlag) bufferedWriter.newLine();
	bufferedWriter.write(buffer.toString());	
	bufferedWriter.close();
	fileWriter.close();
	bufferedWriter = null;
	fileWriter = null;
    }
    
    public void writeRow(String fileName, Boolean fileCreateFlag, ArrayList<String> rowList) throws IOException {
	StringBuilder buffer = new StringBuilder();	
	Iterator<String> iterator = rowList.iterator();	
	while(iterator.hasNext()) {	    
	    if (buffer.length() > 0) {
		buffer.append("\t");
		buffer.append(iterator.next());
	    }
	    else buffer.append(iterator.next());
	}
	
	System.out.println(buffer.toString());
	appendIntoFile(fileName, fileCreateFlag, buffer);
    }
}
