#Author: Ayu
#Created Date : 5/10/2022
#Modified Date :
Feature: TSMP018 Admin edit modul

  Background: 
    Given TSMP018 Admin berhasil membuka form edit data modul

  @tag1
  Scenario Outline: TSMP018 Admin ingin mengedit modul
    When TSMP018 Admin klik input <nama_modul>, <tipe_modul>, <waktu_pengerjaan>, <jumlah_soal>, <kategori>, <deskripsi> dan <status_modul>
    And TSMP018 Admin klik update
    Then TSMP018 Data modul berhasil ditambahkan

    Examples: 
      #| nama_modul    | tipe_modul     | waktu_pengerjaan | jumlah_soal | kategori | deskripsi      | status_modul |
      #| psikotestCoba | ESAI FREE TEXT |                  |             |          |           |              |
      #| psikotestCoba |                |               60 |             |          |           |              |
      #| psikotestCoba |                |                  |          30 |          |           |              |
      #| nama_modul    | tipe_modul     | waktu_pengerjaan | jumlah_soal | kategori | deskripsi | status_modul |
      #| psikotestCoba  | ESAI FREE TEXT |                  |             | STAFF    |           | ACTIVE       |
      #| psikotestCoba  | PILIHAN GANDA  |               90 |             | STAFF    |           | ACTIVE       |
      #| psikotestCoba  | PILIHAN GANDA  |                  |          20 | STAFF    |           | ACTIVE       |
      
      | nama_modul    | tipe_modul     | waktu_pengerjaan | jumlah_soal | kategori | deskripsi      | status_modul |
      | psikotestCoba | ESAI FREE TEXT |                  |             | STAFF    |                | ACTIVE       |
      | psikotestCoba | PILIHAN GANDA  |               90 |             | STAFF    |                | ACTIVE       |
      | psikotestCoba | PILIHAN GANDA  |                  |          20 | STAFF    |                | ACTIVE       |
      | psikotestCoba | PILIHAN GANDA  |                  |             | LEADER   |                | ACTIVE       |
      | psikotestCoba | PILIHAN GANDA  |                  |             | STAFF    | Deskripsi ubah | ACTIVE       |
      | psikotestCoba | PILIHAN GANDA  |                  |             | STAFF    |                | NON ACTIVE   |
      |               | ESAI FREE TEXT |               90 |             | STAFF    |                | ACTIVE       |
      |               | ESAI FREE TEXT |                  |          20 | STAFF    |                | ACTIVE       |
      |               | ESAI FREE TEXT |                  |             | LEADER   |                | ACTIVE       |
      |               | ESAI FREE TEXT |                  |             | STAFF    | Deskripsi ubah | ACTIVE       |
      |               | ESAI FREE TEXT |                  |             | STAFF    |                | NON ACTIVE   |
      |               | PILIHAN GANDA  |               90 |          20 | STAFF    |                | ACTIVE       |
      |               | PILIHAN GANDA  |               90 |             | LEADER   |                | ACTIVE       |
      |               | PILIHAN GANDA  |               90 |             | STAFF    | Deskripsi ubah | ACTIVE       |
      |               | PILIHAN GANDA  |               90 |             | STAFF    |                | NON ACTIVE   |
      |               | PILIHAN GANDA  |                  |          20 | LEADER   |                | ACTIVE       |
      |               | PILIHAN GANDA  |                  |          20 | STAFF    | Deskripsi ubah | ACTIVE       |
      |               | PILIHAN GANDA  |                  |          20 | STAFF    |                | NON ACTIVE   |
