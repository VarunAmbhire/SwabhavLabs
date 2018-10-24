package com.techlabs.readfromproperty;

public class ReadFromPropertyTest {
	public static void main(String[] args) throws Exception {

		ReadWrite readWrite = new ReadWrite();

		
//		readWrite.write("database","sql");
//		readWrite.write("system","windows");

		readWrite.read("database");
		readWrite.read("system");
	}
}
