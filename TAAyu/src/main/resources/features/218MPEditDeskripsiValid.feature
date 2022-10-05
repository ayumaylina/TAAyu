#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 5/10/2022
#Modifier: Ayu
@tag
Feature: TSMP020 Edit deskripsi

  @tag1
  Scenario: TSMP020001 Admin klik icon edit
  	Given TSMP020001 Admin sudah membuka tambah deskripsi
    When TSMP020001 Admin klik icon edit
    Then TSMP020001 Muncul pop up
    
  @tag2
  Scenario: TSMP020002 Admin edit Deskripsi modul
  	Given TSMP020002 Admin sudah masuk ke pop up edit deskripsi
    When TSMP020002 Admin isi field Deskripsi soal
    And TSMP020002 Admin klik tombol UPDATE
    Then TSMP020002 Muncul pop up
    And TSMP020002 Admin klik OK
    
  @tag3
  Scenario: TSMP020003 Admin edit Deskripsi modul
  	Given TSMP020003 Admin sudah masuk ke pop up edit deskripsi
    When TSMP020003 Admin isi field Ketentuan soal
    And TSMP020003 Admin klik tombol UPDATE
    Then TSMP020003 Muncul pop up
    And TSMP020003 Admin klik OK
    
  @tag4
  Scenario: TSMP020004 Admin edit Deskripsi modul
  	Given TSMP020004 Admin sudah masuk ke pop up edit deskripsi
    When TSMP020004 Admin isi field Deskripsi soal
    And TSMP020004 Admin isi field Ketentuan soal
    And TSMP020004 Admin klik tombol UPDATE
    Then TSMP020004 Muncul pop up
    And TSMP020004 Admin klik OK
    
  @tag5
  Scenario: TSMP020005 Admin edit Deskripsi modul
  	Given TSMP020005 Admin sudah masuk ke pop up edit deskripsi
    When TSMP020005 Admin hapus value di field Deskripsi soal
    And TSMP020005 Admin klik tombol UPDATE
    Then TSMP020005 Muncul pop up
    And TSMP020005 Admin klik OK
    
  @tag6
  Scenario: TSMP020006 Admin edit Deskripsi modul
  	Given TSMP020006 Admin sudah masuk ke pop up edit deskripsi
    When TSMP020006 Admin hapus value di field Ketentuan soal
    And TSMP020006 Admin klik tombol UPDATE
    Then TSMP020006 Muncul pop up
    And TSMP020006 Admin klik OK
