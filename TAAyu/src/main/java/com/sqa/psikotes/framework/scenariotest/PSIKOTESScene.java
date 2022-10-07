package com.sqa.psikotes.framework.scenariotest;

public enum PSIKOTESScene {
	
	A001("TSMP001001 Admin buka halaman modul"),
	//1
	
	A002("TSMP002001 Admin cari data berdasarkan nama modul menggunakan enter pada keyboard"),//1
	A003("TSMP002002 Admin cari data berdasarkan nama modul menggunakan button hijau"),//1
	A004("TSMP002003 Admin cari data berdasarkan nama modul menggunakan button search"),//1
	//{1,1,1}
	
	A005("TSMP003 Admin menambah modul"),//20
	//20
	
	A006("TSMP004001 Admin menampilkan10 data modul pada page ke1"),//1
	A007("TSMP004002 Admin menampilkan10 data modul pada page ke2"),//1
	A008("TSMP004003 Admin menampilkan10 data modul pada page ke3"),//1
	A009("TSMP004004 Admin menampilkan10 data modul pada page ke4"),//1
	A010("TSMP004005 Admin menampilkan10 data modul pada page ke5"),//1
	A011("TSMP004006 Admin menampilkan10 data modul pada page paling terakhir"),//1
	A012("TSMP004007 Admin menampilkan10 data modul pada page paling awal"),//1
	//{1,1,1,1,1,1,1}
	
	A013("TSMP005001 Admin menampilkan25 data modul pada page ke1"),//1
	A014("TSMP005002 Admin menampilkan25 data modul pada page terakhir"),//1
	A015("TSMP005003 Admin menampilkan25 data modul pada page ke2"),//1
	A016("TSMP005004 Admin menampilkan25 data modul pada page pertama"),//1
//	1,1,1,1
	
	A017("TSMP006001 Admin menampilkan50 data modul"),//1
	A018("TSMP006002 Admin menampilkan50 data modul pada page ke1"),//1
//	1,1
	
	A019("TSMP008001 Admin menampilkan100 data modul"),//1
	A020("TSMP008002 Admin menampilkan100 data modul pada page ke1"),//1
	//1,1
	
	A021("TSMP009 Admin membuat soal pilihan ganda"),//12
	//12
	
	A022("TSMP010 Admin membuat soal Esai Free Text"),//4
	//4
	
	A023("TSMP011 Admin membuat soal Enum (Ya/Tidak)"),//8
	//8
	
	A024("TSMP012 Admin membuat soal Esai Length"),//22
	//22
	
	A025("TSMP013 Admin membuat soal Pilihan AB"), //6
	
	A026("TSMP014 Admin ingin edit soal pilihan ganda"),//41
	//41
	
	A027("TSMP015001 Admin ingin edit soal esai free text"),//1
	A028("TSMP015002 Admin ingin edit soal esai length"),//21
	//1,21
	
	A029("TSMP016 Admin ingin edit soal enum"),//5
	//5
	
	A030("TSMP007 Admin Hapus modul"),//1
	//1
	
	A031("TSMP017001 Admin ingin menghapus soal pilihan ganda"),//1
	A032("TSMP017002 Admin ingin menghapus soal esai free text"),//1
	A033("TSMP017003 Admin ingin menghapus soal enum"),//1
	A034("TSMP017004 Admin ingin menghapus soal esai length"),//1
	A035("TSMP017005 Admin ingin menghapus soal pilihan ab"),//1
	//1,1,1,1,1
	
	B101("TSMP019001 Admin klik icon plus"),//1
	B102("TSMP019002 Admin input deskripsi soal"),//1
	B103("TSMP019003 Admin input ketentuan soal"),//1
	B104("TSMP019004 Admin input deskripsi soal dan ketentuan soal"),//1
//	1,1,1,1
	
	B105("TSMP020001 Admin klik edit deskripsi"),//1
	B106("TSMP020002 Admin edit deskripsi soal"),//1
	B107("TSMP020003 Admin edit ketentuan soal"),//1
	B108("TSMP020004 Admin edit deskripsi soal dan ketentuan soal"),//1
	B109("TSMP020005 Admin mengosongkan Deskripsi modul"),//1
	B110("TSMP020006 Admin mengosongkan Ketentuan soal"),//1
//	1,1,1,1,1,1
	
	B111("TSMP021001 Admin klik icon delete"),//1
	B112("TSMP021002 Admin delete deskripsi"),//1
//	1,1
	
	A036("TSMP022 Admin ingin edit soal pilihan ab"),//7
	//7
	
	R021("TSMP018001 Admin edit dua field data modul"), //20
	R022("TSMP018002 Admin edit tiga field  data modul"), //14
	R023("TSMP018003 Admin edit empat field  data modull"), //10
	R024("TSMP018004 Admin edit lima field data modul"), //6
	R025("TSMP018005 Admin edit enam field data modul"), //3
	R026("TSMP018006 Admin edit tujuh field data modul"); //1
	//20, 14, 10, 6, 3,1
	
	//A026("TSMP018 Admin Edit modul");//18
	//18
	
	private String testName;
	
	private PSIKOTESScene(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	
		}


}
