package com.rajeshDyadav.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileTest01
{
    public static void main(String[] args)
    {
	File file;	
	FileWriter fileWriter;
	BufferedReader bufferedReader;
	String readBuffer = null;
	try
	{
	    file = new File("FileTest01.txt");
	    fileWriter = new FileWriter(file);	    
	    bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	    readBuffer = bufferedReader.readLine();
	    fileWriter.write(readBuffer);
	    fileWriter.flush();
	    fileWriter.close();
	    bufferedReader.close();
	    System.out.println(file.getAbsolutePath());
	}
	catch (Exception e)
	{
	    e.printStackTrace();
	}	
    }
}
