#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 5/10/2022
#Modified_date: 5/10/2022
#Modifier: Ayu
@tag
Feature: TSMP019 Tambah deskripsi

  @tag1
  Scenario: TSMP019001 Admin klik icon plus
  	Given TSMP019001 Admin sudah login dan sudah membuka halaman modul
    When TSMP019001 Admin klik icon plus
    Then TSMP019001 Muncul pop up
    
  @tag2
  Scenario: TSMP019002 Admin tambah deskripsi modul
  	Given TSMP019002 Admin sudah membuka halaman modul dan sudah klik icon plus
    When TSMP019002 Admin mengisi field Deskripsi modul
    And TSMP019002 Admin klik tombol ADD
    Then TSMP019002 Deskripsi bertambah
    And TSMP019002 Deskripsi dihapus
    
  @tag3
  Scenario: TSMP019003 Admin tambah deskripsi modul
  	Given TSMP019003 Admin sudah membuka halaman modul dan sudah klik icon plus
    When TSMP019003 Admin mengisi field Ketentuan soal
    And TSMP019003 Admin klik tombol ADD
    Then TSMP019003 Deskripsi bertambah
    And TSMP019003 Deskripsi dihapus
    
  @tag4
  Scenario: TSMP019004 Admin tambah deskripsi modul
  	Given TSMP019004 Admin sudah membuka halaman modul dan sudah klik icon plus
    When TSMP019004 Admin mengisi field Deskripsi modul
    And TSMP019004 Admin mengisi field Ketentuan soal
    And TSMP019004 Admin klik tombol ADD
    Then TSMP019004 Deskripsi bertambah
