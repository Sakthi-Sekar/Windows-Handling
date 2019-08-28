package com.config.properties;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.OutputStream;
	import java.util.Properties;

	public class test {

	public String readPropertiesFile(String elements) throws FileNotFoundException {
	Properties prop=new Properties();

	FileInputStream input=new FileInputStream("C:\\Users\\sakthi.sekar\\eclipse-workspace\\com.atmecs.task\\src\\test\\resources\\com\\config\\properties\\config.properties");
	try {
	prop.load(input);

	}
	catch(Exception e) {
	e.printStackTrace();
	}

	String data =prop.getProperty(elements);
	return data;

	}


	}

