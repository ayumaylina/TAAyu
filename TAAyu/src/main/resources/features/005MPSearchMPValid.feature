#Author: Ayu
#Created Date : 29/9/2022
#Modified Date : 
Feature: Admin cari data nama modul

#Background :
#Given
  @tag1
  Scenario: TSMP002001 Admin cari data berdasarkan nama modul menggunakan enter pada keyboard
  	Given TSMP002001 admin berhasil klik tab search pada halaman modul
    When TSMP001001 admin mengetik nama modul
    And TSMP001001 admin menekan enter
    Then TSMP001001 admin berhasil menampillkan data berdasarkan nama yang dicari
  
  @tag2
  Scenario: TSMP002002 Admin cari data berdasarkan nama modul menggunakan button hijau
  	Given TSMP002002 admin berhasil klik tab search pada halaman modul
    When TSMP001002 admin mengetik nama modul
    And TSMP001002 admin menekan button hijau
    Then TSMP001002 admin berhasil menampillkan data berdasarkan nama yang dicari