#Author: Ayu
#Created Date : 4/10/2022
#Modified Date :
Feature: TSMP009 Admin membuat soal pilihan ganda

  Background: 
    Given TSMP009 Admin berhasil membuka form add soal pilihan ganda

  @tag1
  Scenario Outline: TSMP009 Admin ingin membuat soal pilihan ganda
    When TSMP009 Admin input soal, pilihan A, pilihan B, pilihan C, pilihan D, pilihan E, <kunci_jawaban> dan <gambar>
    And TSMP009 Admin klik add soal
    Then TSMP009 Data soal berhasil diupload

    Examples: 
      #| kunci_jawaban |                                                                |
      #| A             | C:\Users\nexsoft\git\TAAyu\TAAyu\Data\Jenis Testing.jpg  |
      #| A             | C:\\Users\nexsoft\\git\\TAAyu\\TAAyu\\Data\\Jenis Testing.jpg  |
      #| A             | C:\\Users\nexsoft\\git\\TAAyu\\TAAyu\\Data\\Jenis Testing.jpeg |
      #12
      | kunci_jawaban | gambar                     |
      | A             | \Data\Jenis Testing.PNG  |
      | A             | \Data\Jenis Testing.jpg  |
      | A             | \Data\Jenis Testing.jpeg |
      | A             |                            |
      | B             | \Data\Jenis Testing.jpeg |
      | B             |                            |
      | C             | \Data\Jenis Testing.jpeg |
      | C             |                            |
      | D             | \Data\Jenis Testing.jpeg |
      | D             |                            |
      | E             | \Data\Jenis Testing.jpeg |
      | E             |                            |
