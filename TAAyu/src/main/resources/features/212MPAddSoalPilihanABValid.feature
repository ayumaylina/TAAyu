#Author: Ayu
#Created Date : 5/10/2022
#Modified Date :
Feature: TSMP013 Admin membuat soal pilihan AB

  Background: 
    Given TSMP013 Admin berhasil membuka form add soal pilihan ab

  @tag1
  Scenario Outline: TSMP013 Admin ingin membuat soal pilihan ab
    When TSMP013 Admin input pilihan A, pilihan B, <kunciJawaban> dan <gambar>
    And TSMP013 Admin klik add soal
    Then TSMP013 Data soal berhasil diupload

#6
    Examples: 
      | kunciJawaban | gambar                   |
      | B             |                          |
      | B             | \Data\Jenis Testing.PNG  |
      | B             | \Data\Jenis Testing.jpg  |
      | B             | \Data\Jenis Testing.jpeg |
      | A             |                          |
      | A             | \Data\Jenis Testing.jpeg |
