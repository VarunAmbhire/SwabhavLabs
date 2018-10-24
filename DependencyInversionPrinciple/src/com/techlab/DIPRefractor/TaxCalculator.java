package com.techlab.DIPRefractor;

import com.techlab.DIPViolation.LogType;

public class TaxCalculator {

	private LogType logType;
	Logger logger;

	public LogType getLogType() {
		return logType;
	}

	public void setLogType(LogType logType) {
		this.logType = logType;
	}

	public void calculate(int salary, int hours) {
		try {
			int hourlySalary = salary / hours;
			System.out.println("salary per hour " + hourlySalary);
		} catch (Exception e) {
			System.out.println(errorMessage());
		}
	}

	private String errorMessage() {
		return logger.log();
	}
}
