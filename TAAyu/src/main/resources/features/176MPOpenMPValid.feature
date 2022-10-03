#Author: Ayu
#Created Date : 29/9/2022
#Modified Date : 

Feature: TSMP001 Admin masuk ke halaman modul
Background:
	    Given TSMP001 Admin harus membuka halaman utama web

  @tag1
  Scenario: TSMP001001 Admin buka halaman modul
    When TSMP001001 admin klik menu task
    And TSMP001001 admin klik submenu modul
    Then TSMP001001 admin berhasil buka halaman modul
