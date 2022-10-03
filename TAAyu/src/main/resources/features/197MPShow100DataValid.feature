#Author: Ayu
#Created Date : 3/10/2022
#Modified Date : 
Feature: TSMP008 Admin lihat100 data Modul Page

Background:
	Given TSMP008 Admin berhasil masuk halaman modul
	
  @tag1
  Scenario: TSMP008001 Admin menampilkan100 data modul 
    When TSMP008001 admin klik dropdown show data100
    Then TSMP008001 Tampil100 data modul
    
  @tag1
  Scenario: TSMP008002 Admin menampilkan100 data modul pada page ke1
    When TSMP008002 admin klik button page1
    Then TSMP008002 Tampil100 data modul pada page ke1