#Author: Ayu
#Created Date : 4/10/2022
#Modified Date :
Feature: TSMP011 Admin membuat soal Enum (Ya/Tidak)

  Background: 
    Given TSMP011 Admin berhasil membuka form add soal Enum

  @tag1
  Scenario Outline: TSMP011 Admin ingin membuat soal Enum
    When TSMP011 Admin input soal dan <kunci_jawaban> dan <gambar>
    And TSMP011 Admin klik add soal
    Then TSMP011 Data soal berhasil diupload

    #8
    Examples: 
      | kunci_jawaban | gambar                     |
      | Ya            | \Data\Jenis Testing.PNG  |
      | Ya            | \Data\Jenis Testing.jpg  |
      | Ya            | \Data\Jenis Testing.jpeg |
      | Ya            |                            |
      | Tidak         | \Data\Jenis Testing.PNG  |
      | Tidak         | \Data\Jenis Testing.jpg  |
      | Tidak         | \Data\Jenis Testing.jpeg |
      | Tidak         |                            |
