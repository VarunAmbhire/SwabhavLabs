package com.techlabs.readfromproperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ReadWrite {

	String file = "config.properties";

	Properties properties = new Properties();

	public void write(String key, String value) throws Exception {

		OutputStream outputStream = new FileOutputStream(file);
		properties.setProperty(key, value);

		properties.store(outputStream, null);
		if (outputStream != null) {
			outputStream.close();
		}

	}

	public void read(String key) throws Exception {
		InputStream inputStream = new FileInputStream(file);
		properties.load(inputStream);
		System.out.println(properties.getProperty(key));

		if (inputStream != null) {
			inputStream.close();
		}
	}

}
