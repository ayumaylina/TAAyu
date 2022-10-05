#Author: Ayu
#Created Date : 5/10/2022
#Modified Date :
Feature: TSMP013 Admin membuat soal pilihan AB

  Background: 
    Given TSMP013 Admin berhasil membuka form add soal pilihan ganda

  @tag1
  Scenario Outline: TSMP013 Admin ingin membuat soal pilihan ganda
    When TSMP013 Admin input soal, pilihan A, pilihan B, pilihan C, pilihan D, pilihan E, <kunci_jawaban> dan <gambar>
    And TSMP013 Admin klik add soal
    Then TSMP013 Data soal berhasil diupload