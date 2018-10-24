package com.techlab.DIPViolation;

public class TaxCalculator {

	private LogType logType;
	XMLLogger xmlLogger = new XMLLogger();
	EmailLogger emailLogger = new EmailLogger();

	public LogType getLogType() {
		return logType;
	}

	public void setLogType(LogType logType) {
		this.logType = logType;
	}

	public void calculate(int salary, int hour) {
		try {
			int totalSalary = salary / hour;
			System.out.println("Salary Monthly " + totalSalary);
		} catch (Exception e) {
			System.out.println(errorMessage());
		}
	}

	private String errorMessage() {
		if (getLogType() == LogType.XML)
			return xmlLogger.log();
		return emailLogger.log();

	}
}
