#Author: Ayu
#Created Date : 6/10/2022
#Modified Date :
Feature: TSMP016 Admin edit soal Enum

  @tag1
  Scenario Outline: TSMP016 Admin ingin edit soal enum
    Given TSMP016 Admin berhasil membuka form edit soal enum
    When TSMP016 Admin edit <soal> dan <kunciJawaban>
    And TSMP016 Admin klik update soal
    Then TSMP016 Data soal berhasil di update
#5
    Examples: 
      | soal      | kunciJawaban |
      |           | Ya           |
      | ubah soal |              |
      | ubah soal | Ya           |
      |           | Tidak        |
