#Author: Ayu
#Created Date : 29/9/2022
#Modified Date : 
Feature: Admin login valid ke web

  @tag1
  Scenario: TSMP001001 Admin buka halaman modul
  	Given TSMP001001 admin berhasil login
    When TSMP001001 admin klik menu task
    And TSMP001001 admin klik submenu modul
    Then TSMP001001 admin berhasil buka halaman modul
