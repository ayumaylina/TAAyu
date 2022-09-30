package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {

	A1("TSMP001001 Admin buka halaman modul"),
	A2("TSMP002001 Admin cari data berdasarkan nama modul menggunakan enter pada keyboard"),
	A3("TSMP002002 Admin cari data berdasarkan nama modul menggunakan button hijau"),
	A4("TSMP002003 Admin cari data berdasarkan nama modul menggunakan button search");
	
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
