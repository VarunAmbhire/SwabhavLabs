package com.techlab.interfaceapp;

public class DBOperation {

	public static void main(String[] args) {
		InvoiceDB invoiceDB=new InvoiceDB();
		CustomerDB customerDB=new CustomerDB();
		DepartmentDB departmentDB=new DepartmentDB();
		
		doOperation(invoiceDB);
		doOperation(customerDB);
		doOperation(departmentDB);
		
	}

	static void doOperation(ICradable iCradable){
		iCradable.create();
		iCradable.read();
		iCradable.update();
		iCradable.delete();
	}
}
