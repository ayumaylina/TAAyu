#Author: Ayu
#Created Date : 5/10/2022
#Modified Date :

Feature: TSMP017 Admin Hapus soal

  @tag1
  Scenario: TSMP017001 Admin ingin menghapus soal pilihan ganda
    Given TSMP017001 Admin berhasil masuk form template soal pilihan ganda
    When TSMP017001 Admin klik button hapus
    And TSMP017001 Admin klik button iya
    Then TSMP017001 Data soal berhasil dihapus
    
  @tag2
  Scenario: TSMP017002 Admin ingin menghapus soal esai free text
    Given TSMP017002 Admin berhasil masuk form template soal esai free text
    When TSMP017002 Admin klik button hapus
    And TSMP017002 Admin klik button iya
    Then TSMP017002 Data soal berhasil dihapus
    
  @tag3
  Scenario: TSMP017003 Admin ingin menghapus soal enum
    Given TSMP017003 Admin berhasil masuk form template soal enum
    When TSMP017003 Admin klik button hapus
    And TSMP017003 Admin klik button iya
    Then TSMP017003 Data soal berhasil dihapus
    
  @tag4
  Scenario: TSMP017004 Admin ingin menghapus soal esai length
    Given TSMP017004 Admin berhasil masuk form template soal esai length
    When TSMP017004 Admin klik button hapus
    And TSMP017004 Admin klik button iya
    Then TSMP017004 Data soal berhasil dihapus
    
  @tag5
  Scenario: TSMP017005 Admin ingin menghapus soal pilihan ab
    Given TSMP017005 Admin berhasil masuk form template soal pilihan ab
    When TSMP017005 Admin klik button hapus
    And TSMP017005 Admin klik button iya
    Then TSMP017005 Data soal berhasil dihapus