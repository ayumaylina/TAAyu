#Author: Ayu
#Created Date : 5/10/2022
#Modified Date :
Feature: TSMP014 Admin edit soal pilihan ganda

  Background: 
    Given TSMP014 Admin berhasil membuka form edit soal pilihan ganda

  @tag1
  Scenario Outline: TSMP014 Admin ingin edit soal pilihan ganda
    When TSMP014 Admin edit <soal>, <pilihanA>, <pilihanB>, <pilihanC>, <pilihanD>, <pilihanE>, dan <kunciJawaban>
    And TSMP014 Admin klik update soal
    Then TSMP014 Data soal berhasil di update
#41
    Examples: 
      | soal            | pilihanA     | pilihanB     | pilihanC     | pilihanD     | pilihanE     | kunciJawaban |
      |                 | ubahPilihanA |              |              |              |              |              |
      |                 |              | ubahPilihanB |              |              |              |              |
      |                 |              |              | ubahPilihanC |              |              |              |
      |                 |              |              |              | ubahPilihanD |              |              |
      |                 |              |              |              |              | ubahPilihanE |              |
      |                 |              |              |              |              |              | A            |
      |                 |              |              |              |              |              | B            |
      |                 |              |              |              |              |              | C            |
      |                 |              |              |              |              |              | D            |
      |                 |              |              |              |              |              | E            |
      | ketik soal edit |              |              |              |              |              |              |
      |                 | ubahPilihanA | ubahPilihanB |              |              |              |              |
      |                 | ubahPilihanA |              | ubahPilihanC |              |              |              |
      |                 | ubahPilihanA |              |              | ubahPilihanD |              |              |
      |                 | ubahPilihanA |              |              |              | ubahPilihanE |              |
      |                 |              | ubahPilihanB | ubahPilihanC |              |              |              |
      |                 |              | ubahPilihanB |              | ubahPilihanD |              |              |
      |                 |              | ubahPilihanB |              |              | ubahPilihanE |              |
      |                 |              |              | ubahPilihanC | ubahPilihanD |              |              |
      |                 |              |              | ubahPilihanC |              | ubahPilihanE |              |
      |                 |              |              |              | ubahPilihanD | ubahPilihanE |              |
      |                 | ubahPilihanA | ubahPilihanB | ubahPilihanC |              |              |              |
      |                 | ubahPilihanA |              |              | ubahPilihanD | ubahPilihanE |              |
      |                 |              | ubahPilihanB | ubahPilihanC | ubahPilihanD |              |              |
      |                 |              | ubahPilihanB |              | ubahPilihanD | ubahPilihanE |              |
      |                 | ubahPilihanA | ubahPilihanB |              |              | ubahPilihanE |              |
      |                 | ubahPilihanA |              | ubahPilihanC | ubahPilihanD |              |              |
      |                 |              |              | ubahPilihanC | ubahPilihanD | ubahPilihanE |              |
      |                 | ubahPilihanA | ubahPilihanB |              | ubahPilihanD |              |              |
      |                 | ubahPilihanA | ubahPilihanB | ubahPilihanC | ubahPilihanD |              |              |
      |                 | ubahPilihanA | ubahPilihanB | ubahPilihanC |              | ubahPilihanE |              |
      |                 |              | ubahPilihanB | ubahPilihanC | ubahPilihanD | ubahPilihanE |              |
      |                 | ubahPilihanA |              | ubahPilihanC | ubahPilihanD | ubahPilihanE |              |
      |                 | ubahPilihanA | ubahPilihanB |              | ubahPilihanD | ubahPilihanE |              |
      |                 | ubahPilihanA | ubahPilihanB | ubahPilihanC | ubahPilihanD | ubahPilihanE |              |
      | ketik soal edit | ubahPilihanA | ubahPilihanB | ubahPilihanC | ubahPilihanD | ubahPilihanE |              |
      | ketik soal edit | ubahPilihanA | ubahPilihanB | ubahPilihanC | ubahPilihanD | ubahPilihanE | A            |
      | ketik soal edit | ubahPilihanA | ubahPilihanB | ubahPilihanC | ubahPilihanD | ubahPilihanE | B            |
      | ketik soal edit | ubahPilihanA | ubahPilihanB | ubahPilihanC | ubahPilihanD | ubahPilihanE | C            |
      | ketik soal edit | ubahPilihanA | ubahPilihanB | ubahPilihanC | ubahPilihanD | ubahPilihanE | D            |
      | ketik soal edit | ubahPilihanA | ubahPilihanB | ubahPilihanC | ubahPilihanD | ubahPilihanE | E            |
