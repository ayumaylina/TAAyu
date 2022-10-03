#Author: Ayu
#Created Date : 2/10/2022
#Modified Date : 
Feature: TSMP003 Admin tambah modul

Background:
	Given TSMP003 Admin berhasil membuka form add data modul
	
  @tag1
  Scenario: TSMP003 Admin ingin menambahkan modul
    When TSMP003 Admin klik input nama_modul, tipe_modul, waktu_pengerjaan, jumlah_soal, kategori, deskripsi, dan status_modul 
    And TSMP003 Admin klik save
    And TSMP003 Admin klik ok
    And TSMP003 Admin klik ok1
    Then TSMP003 Data modul baru berhasil ditambahkan
    Examples:
| nama_modul	| tipe_modul |	waktu_pengerjaan |	jumlah_soal |	kategori |	deskripsi |	status_modul |
| pikotestCoba |	PILIHAN GANDA |	90 |	20 |	LEADER |	Deskripsi Test |	ACTIVE |
| pikotestCoba |	PILIHAN GANDA |	90 |	20 |	STAFF |	Deskripsi Test |	ACTIVE |
| pikotestCoba |	PILIHAN GANDA |	90 |	20 |	STAFF |	Deskripsi Test |	 NON ACTIVE |
| pikotestCoba |	PILIHAN GANDA |	90 |	20 |	LEADER |	Deskripsi Test |	 NON ACTIVE |
| pikotestCoba |	ESAI FREE TEXT |	90 |	20 |	LEADER |	Deskripsi Test |	ACTIVE |
| pikotestCoba |	ESAI FREE TEXT |	90 |	20 |	STAFF |	Deskripsi Test |	ACTIVE |
| pikotestCoba |	ESAI FREE TEXT |	90 |	20 |	STAFF |	Deskripsi Test |	 NON ACTIVE |
| pikotestCoba |	ESAI FREE TEXT |	90 |	20 |	LEADER |	Deskripsi Test |	 NON ACTIVE |
| pikotestCoba |	ENUM (YA/TIDAK) |	90 |	20 |	LEADER |	Deskripsi Test |	ACTIVE |
| pikotestCoba |	ENUM (YA/TIDAK) |	90 |	20 |	STAFF |	Deskripsi Test |	ACTIVE |
| pikotestCoba |	ENUM (YA/TIDAK) |	90 |	20 |	STAFF |	Deskripsi Test |	 NON ACTIVE |
| pikotestCoba |	ENUM (YA/TIDAK) |	90 |	20 |	LEADER |	Deskripsi Test |	 NON ACTIVE |
| pikotestCoba |	ESAI LENGTH |	90 |	20 |	LEADER |	Deskripsi Test |	ACTIVE |
| pikotestCoba |	ESAI LENGTH |	90 |	20 |	STAFF |	Deskripsi Test |	ACTIVE |
| pikotestCoba |	ESAI LENGTH |	90 |	20 |	STAFF |	Deskripsi Test |	 NON ACTIVE |
| pikotestCoba |	ESAI LENGTH |	90 |	20 |	LEADER |	Deskripsi Test |	 NON ACTIVE |
| pikotestCoba |	PILIHAN A/B |	90 |	20 |	LEADER |	Deskripsi Test |	ACTIVE |
| pikotestCoba |	PILIHAN A/B |	90 |	20 |	STAFF |	Deskripsi Test |	ACTIVE |
| pikotestCoba |	PILIHAN A/B |	90 |	20 |	STAFF |	Deskripsi Test |	 NON ACTIVE |
| pikotestCoba |	PILIHAN A/B |	90 |	20 |	LEADER |	Deskripsi Test |	 NON ACTIVE |

  	

  	
  	


    
  