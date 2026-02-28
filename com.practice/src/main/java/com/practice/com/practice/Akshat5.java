package com.practice.com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Akshat5 {
	@Test(dataProvider = "datagiver")
	void datacheck(String data1, String data2 )throws Exception{
		
		System.out.println(data1);
		System.out.println(data2);
		
		
	}



@DataProvider
public Object [][] datagiver() throws Exception{
	
	//Object mydata[] [] = {{"abcd123","1555234"},{"abcd","123588584"},{"abcd","12558834"} };
	
		File File= new File("C:\\Users\\pmmis\\eclipse-workspace\\com.practice\\src\\main\\java\\Akshat.properties");
		FileInputStream FileInput=new FileInputStream(File);
		Properties properties= new Properties();
		properties.load(FileInput);
			
		Object mydata[] []=new Object[2][2];
			mydata[0][0]=properties.getProperty("url");
			mydata[0][1]=properties.getProperty("url1");
			mydata[1][0]="ABX";
		    mydata[1][1]="BBX";

			//mydata[1][2]=properties.getProperty("url2");
	

	
	
	return mydata;
	
	}
	
}