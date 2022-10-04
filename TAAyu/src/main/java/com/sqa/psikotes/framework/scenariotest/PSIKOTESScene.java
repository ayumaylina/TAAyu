package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {
	
	A001("TSMP001001 Admin buka halaman modul"),
	//1
	
	A002("TSMP002001 Admin cari data berdasarkan nama modul menggunakan enter pada keyboard"),//1
	A003("TSMP002002 Admin cari data berdasarkan nama modul menggunakan button hijau"),//1
	A004("TSMP002003 Admin cari data berdasarkan nama modul menggunakan button search"),//1
//	//{1,1,1}
	
	A005("TSMP003 Admin menambah modul"),//20
	//20
	
	A006("TSMP004001 Admin menampilkan10 data modul pada page ke1"),//1
	A007("TSMP004002 Admin menampilkan10 data modul pada page ke2"),//1
	A008("TSMP004003 Admin menampilkan10 data modul pada page ke3"),//1
	A009("TSMP004004 Admin menampilkan10 data modul pada page ke4"),//1
	A010("TSMP004005 Admin menampilkan10 data modul pada page ke5"),//1
	A011("TSMP004006 Admin menampilkan10 data modul pada page paling terakhir"),//1
	A012("TSMP004007 Admin menampilkan10 data modul pada page paling awal"),//1
//	//{1,1,1,1,1,1,1}
	
	A013("TSMP005001 Admin menampilkan25 data modul pada page ke1"),//1
	A014("TSMP005002 Admin menampilkan25 data modul pada page terakhir"),//1
	A015("TSMP005003 Admin menampilkan25 data modul pada page ke2"),//1
	A016("TSMP005004 Admin menampilkan25 data modul pada page pertama"),//1
//	1,1,1,1
	
	A017("TSMP006001 Admin menampilkan50 data modul"),//1
	A018("TSMP006002 Admin menampilkan50 data modul pada page ke1"),//1
//	1,1
	
	A019("TSMP008001 Admin menampilkan100 data modul"),//1
	A020("TSMP006002 Admin menampilkan100 data modul pada page ke1"),//1
	//1,1
	
	A021("TSMP009 Admin membuat soal pilihan ganda"),//12
	//12
	
	A022("TSMP010 Admin membuat soal Esai Free Text"),//1
	//1
	
	A023("TSMP011 Admin membuat soal Enum"),//2
	//2
	A024("TSMP012 Admin membuat soal Esai Length");//10
	//10
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
