package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {

	A1("Admin login valid click button signin"),
	A2("Admin open modul page");
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
