#Author: Ayu
#Created Date : 30/9/2022
#Modified Date : 
Feature: TSMP005 Admin lihat25 data Modul Page

Background:
	Given TSMP005 Admin memilih icon show page25
	
  @tag1
  Scenario: TSMP005001 Admin menampilkan25 data modul pada page ke1
    When TSMP005001 admin klik button page1
    Then TSMP005001 Tampil25 data modul pada page ke1
  
  @tag2
  Scenario: TSMP005002 Admin menampilkan25 data modul pada page terakhir
    When TSMP005002 admin klik button page >>
    Then TSMP005002 Tampil25 data modul pada page terakhir
    
  @tag3
  Scenario: TSMP005003 Admin menampilkan25 data modul pada page ke2
    When TSMP005003 admin klik button page2
    Then TSMP005003 Tampil25 data modul pada page ke2
    
  @tag4
  Scenario: TSMP005004 Admin menampilkan25 data modul pada page pertama
    When TSMP005004 admin klik button page <<
    Then TSMP005004 Tampil25 data modul pada page pertama
    