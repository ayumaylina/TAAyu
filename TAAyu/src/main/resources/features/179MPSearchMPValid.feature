#Author: Ayu
#Created Date : 29/9/2022
#Modified Date : 
Feature: TSMP002 Admin cari data nama modul

Background:
	Given TSMP002 Admin harus klik field search Data Modul pada halaman Data Modul
	
  @tag1
  Scenario: TSMP002001 Admin cari data berdasarkan nama modul menggunakan enter pada keyboard
    When TSMP002001 admin mengetik nama modul
    And TSMP002001 admin menekan enter
    Then TSMP002001 Tampil data berdasarkan nama yang dicari
  
  @tag2
  Scenario: TSMP002002 Admin cari data berdasarkan nama modul menggunakan button hijau
    When TSMP002002 admin mengetik nama modul
    And TSMP002002 admin klik button hijau
    Then TSMP002002 Tampil data berdasarkan nama yang dicari
    
  @tag3
  Scenario: TSMP002003 Admin cari data berdasarkan nama modul menggunakan button search
    When TSMP002003 admin mengetik nama modul
    And TSMP002003 admin klik button search
    Then TSMP002003 Tampil data berdasarkan nama yang dicari