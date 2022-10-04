#Author: Ayu
#Created Date : 3/10/2022
#Modified Date :

Feature: TSMP007 Admin Hapus modul

  Background: 
    Given TSMP007 Admin berhasil masuk halaman modul

  @tag1
  Scenario: TSMP007 Admin ingin menghapus modul
    When TSMP007 Admin klik button hapus
    And TSMP007 Admin klik button iya
    Then TSMP007 Data modul baru berhasil dihapus