#Author: Ayu
#Created Date : 4/10/2022
#Modified Date :
Feature: TSMP010 Admin membuat soal Esai Free Text

  Background: 
    Given TSMP010 Admin berhasil membuka form add soal Esai Free Text

  @tag1
  Scenario Outline: TSMP010 Admin ingin membuat soal Esai Free Text
    When TSMP010 Admin input soal
    And TSMP010 Admin klik add soal
    Then TSMP010 Data soal berhasil diupload
  