package com.practice.com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class akshat4 {
	public static void main(String[] args) throws Exception {
		File File = new File("C:\\Users\\pmmis\\eclipse-workspace\\com.practice\\src\\main\\java\\Akshat.properties");
		FileInputStream FileInput = new FileInputStream(File);
		Properties properties = new Properties();
		properties.load(FileInput);
		System.out.println(properties.getProperty("url"));

	}
}