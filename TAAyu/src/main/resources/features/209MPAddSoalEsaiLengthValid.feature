#Author: Ayu
#Created Date : 4/10/2022
#Modified Date :
Feature: TSMP012 Admin membuat soal Esai Length

  Background: 
    Given TSMP012 Admin berhasil membuka form add soal Esai Length

  @tag1
  Scenario Outline: TSMP012 Admin ingin membuat soal Esai Length
    When TSMP012 Admin input soal dan <score>
    And TSMP012 Admin klik add soal
    Then TSMP012 Data soal berhasil diupload

    Examples: 
      | score |
      |     1 |
      |     2 |
      |     3 |
      |     4 |
      |     5 |
      |     6 |
      |     7 |
      |     8 |
      |     9 |
      |    10 |
