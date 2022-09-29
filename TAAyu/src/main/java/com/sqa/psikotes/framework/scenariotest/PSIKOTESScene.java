package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {

	R1("Admin login valid click button signin"),
	R2("Admin login valid click button green username"),
	R3("Admin login valid click button green password");
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
