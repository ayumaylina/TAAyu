#Author: Ayu
#Created Date : 30/9/2022
#Modified Date : 
Feature: TSMP004 Admin cari data nama modul

Background:
	Given TSMP004 Admin memilih icon show page10
	
  @tag1
  Scenario: TSMP004001 Admin menampilkan10 data modul pada page ke1
    When TSMP004001 admin klik button page1
    Then TSMP004001 Tampil10 data modul pada page ke1
    
  @tag2
  Scenario: TSMP004002 Admin menampilkan10 data modul pada page ke2
    When TSMP004002 admin klik button page2
    Then TSMP004002 Tampil10 data modul pada page ke2
    
  @tag3
  Scenario: TSMP004003 Admin menampilkan10 data modul pada page ke3
    When TSMP004003 admin klik button page3
    Then TSMP004003 Tampil10 data modul pada page ke3
    
  @tag4
  Scenario: TSMP004004 Admin menampilkan10 data modul pada page ke4
    When TSMP004004 admin klik button page4
    Then TSMP004004 Tampil10 data modul pada page ke4
    
  @tag5
  Scenario: TSMP004005 Admin menampilkan10 data modul pada page ke5
    When TSMP004005 admin klik button page5
    Then TSMP004005 Tampil10 data modul pada page ke5
    
  @tag6
  Scenario: TSMP004006 Admin menampilkan10 data modul pada page paling terakhir
    When TSMP004006 admin klik button page >>
    Then TSMP004006 Tampil10 data modul pada page paling terakhir
    
  @tag7
  Scenario: TSMP004007 Admin menampilkan10 data modul pada page paling awal
    When TSMP004007 admin klik button page <<
    Then TSMP004007 Tampil10 data modul pada page paling awal