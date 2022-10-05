#Author: Ayu
#Created Date : 4/10/2022
#Modified Date :
Feature: TSMP012 Admin membuat soal Esai Length

  Background: 
    Given TSMP012 Admin berhasil membuka form add soal Esai Length

  @tag1
  Scenario Outline: TSMP012 Admin ingin membuat soal Esai Length
    When TSMP012 Admin input soal dan <score> dan <gambar>
    And TSMP012 Admin klik add soal
    Then TSMP012 Data soal berhasil diupload

#22
    Examples: 
      | score | gambar                    |
      |     1 | \Data\Jenis Testing.PNG   |
      |     1 | \Data\Jenis Testing.jpg   |
      |     1 | \Data\Jenis Testing.jpeg  |
      |     1 |                           |
      |     2 | \Data\Jenis Testing.jpeg  |
      |     2 |                           |
      |     3 | \Data\Jenis Testing.jpeg  |
      |     3 |                           |
      |     4 | \Data\Jenis Testing.jpeg  |
      |     4 |                           |
      |     5 | \Data\Jenis Testing.jpeg  |
      |     5 |                           |
      |     6 | \Data\Jenis Testing.jpeg  |
      |     6 |                           |
      |     7 | \Data\Jenis Testing.jpeg  |
      |     7 |                           |
      |     8 | \Data\Jenis Testing.jpeg  |
      |     8 |                           |
      |     9 | \Data\Jenis Testing.jpeg  |
      |     9 |                           |
      |    10 | \Data\Jenis Testing.jpeg  |
      |    10 |                           |
