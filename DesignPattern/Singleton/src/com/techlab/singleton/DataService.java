package com.techlab.singleton;

public class DataService {

	private static DataService bucket;

	private DataService() {
	}

	public static DataService getInstance() {
		if (bucket == null) {
			synchronized (DataService.class) {
				bucket = new DataService();	
			}
		}
		return bucket;
	}
}
