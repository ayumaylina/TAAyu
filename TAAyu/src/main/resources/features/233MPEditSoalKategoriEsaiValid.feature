#Author: Ayu
#Created Date : 6/10/2022
#Modified Date :
Feature: TSMP015 Admin edit soal Esai Free Text

  @tag1
  Scenario: TSMP015001 Admin ingin edit soal esai free text
    Given TSMP015001 Admin berhasil membuka form edit soal esai free text
    When TSMP015001 Admin edit soal
    And TSMP015001 Admin klik update soal
    Then TSMP015001 Data soal berhasil di update

  @tag1
  Scenario Outline: TSMP015002 Admin ingin edit soal esai length
    Given TSMP015002 Admin berhasil membuka form edit soal esai length
    When TSMP015002 Admin edit <soal> dan <score>
    And TSMP015002 Admin klik update soal
    Then TSMP015002 Data soal berhasil di update
#21
    Examples: 
      | soal      | score |
      #| ubah soal |       |
      |           |     1 |
      |           |     2 |
      |           |     3 |
      |           |     4 |
      |           |     5 |
      |           |     6 |
      |           |     7 |
      |           |     8 |
      |           |     9 |
      |           |    10 |
      | ubah soal |     1 |
      | ubah soal |     2 |
      | ubah soal |     3 |
      | ubah soal |     4 |
      | ubah soal |     5 |
      | ubah soal |     6 |
      | ubah soal |     7 |
      | ubah soal |     8 |
      | ubah soal |     9 |
      | ubah soal |    10 |
