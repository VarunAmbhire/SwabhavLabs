package com.techlab.rtoapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Properties;

public class DataBase {
	String file = "data.properties";
	Properties properties = new Properties();
	

	public void write(ArrayList<RTO> rtos) throws Exception {
		OutputStream outputStream = new FileOutputStream(file);
		for (RTO rto : rtos) {
			properties.setProperty(rto.getCode(), rto.getState());
		}
		properties.store(outputStream, null);
		if (outputStream != null) {
			outputStream.close();
		}
	}

	public Properties read() throws Exception {
		InputStream inputStream = new FileInputStream(file);
		properties.load(inputStream);
		if (inputStream != null) {
			inputStream.close();
		}
		return properties;
	}

}
