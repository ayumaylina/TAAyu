#Author: Ayu
#Created Date : 1/10/2022
#Modified Date : 
Feature: TSMP006 Admin lihat50 data Modul Page

Background:
	Given TSMP006 Admin berhasil masuk halaman modul
	
  @tag1
  Scenario: TSMP006001 Admin menampilkan50 data modul 
    When TSMP006001 admin klik dropdown show data50
    Then TSMP006001 Tampil50 data modul
    
  @tag1
  Scenario: TSMP006002 Admin menampilkan50 data modul pada page ke1
    When TSMP006002 admin klik button page1
    Then TSMP006002 Tampil50 data modul pada page ke1