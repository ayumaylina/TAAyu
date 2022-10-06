#Author: Ayu
#Created Date : 6/10/2022
#Modified Date :
Feature: TSMP022 Admin edit soal Pilihan AB

  @tag1
  Scenario Outline: TSMP022 Admin ingin edit soal pilihan ab
    Given TSMP022 Admin berhasil membuka form edit soal pilihan ab
    When TSMP022 Admin edit <pilihanA>, <pilihanB> dan <kunciJawaban>
    And TSMP022 Admin klik update soal
    Then TSMP022 Data soal berhasil di update
#7
    Examples: 
      | pilihanA       | pilihanB       | kunciJawaban |
      | ubah pilihan A |                |              |
      |                | ubah Pilihan B |              |
      | ubah pilihan A | ubah Pilihan B |              |
      |                |                | A            |
      |                |                | B            |
      | ubah pilihan A | Ubah Pilihan B | A            |
      | ubah pilihan A | Ubah Pilihan B | B            |
