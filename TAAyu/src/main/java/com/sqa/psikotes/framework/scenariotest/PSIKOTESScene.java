package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {

	A1("TSMP001001 Admin buka halaman modul"),
	A2("TSMP002001 Admin cari data berdasarkan nama modul menggunakan enter pada keyboard"),
	A3("TSMP002002 Admin cari data berdasarkan nama modul menggunakan button hijau"),
	A4("TSMP002003 Admin cari data berdasarkan nama modul menggunakan button search"),
	A5("TSMP004001 Admin menampilkan10 data modul pada page ke1"),
	A6("TSMP004002 Admin menampilkan10 data modul pada page ke2"),
	A7("TSMP004003 Admin menampilkan10 data modul pada page ke3"),
	A8("TSMP004004 Admin menampilkan10 data modul pada page ke4"),
	A9("TSMP004005 Admin menampilkan10 data modul pada page ke5"),
	A10("TSMP004006 Admin menampilkan10 data modul pada page paling terakhir"),
	A11("TSMP004007 Admin menampilkan10 data modul pada page paling awal");
	
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
