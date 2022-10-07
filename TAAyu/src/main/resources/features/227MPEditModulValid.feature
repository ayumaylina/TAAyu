#Author: Runanto
#Created date: 04/10/2022
#Modifer:
#Modifer date:
Feature: TSMP018 Admin Edit Data Modul

  Background: 
    Given TSMP018001 Admin berhasil masuk form edit modul

  @tag1
  Scenario Outline: TSMP018001 Admin edit dua field data modul
    When TSMP018001 Admin edit field <nama>, <tipe_modul>, <waktu_pengerjaan>, <jumlah_soal>, <kategori>, <deskripsi>, <status_modul> modul
    And TSMP018001 Admin klik tombol update
    And TSMP018001 Data modul berhasil diedit

    #Data ubah dua field (20 Data)
    Examples: 
      | nama          | tipe_modul     | waktu_pengerjaan | jumlah_soal | kategori | deskripsi      | status_modul |
      | psikotestCoba | PILIHAN GANDA  |                  |             |          |                |             |
      | psikotestCoba |                |              100 |             |          |                |              |
      | psikotestCoba |                |                  |         100 |          |                |              |
      | psikotestCoba |                |                  |             | LEADER   |                |              |
      | psikotestCoba |                |                  |             |          | Deskripsi ubah |              |
      | psikotestCoba |                |                  |             |          |                | NON ACTIVE   |
      | psikotestCoba |                |                  |             |          |                |              |
      |               | PILIHAN GANDA  |               90 |             |          |                |              |
      |               | ESAI FREE TEXT |                  |          30 |          |                |              |
      |               | PILIHAN GANDA  |                  |             | STAFF    |                |              |
      |               | ESAI FREE TEXT |                  |             |          | Deskripsi ubah |              |
      |               | PILIHAN GANDA  |                  |             |          |                | ACTIVE       |
      |               |                |               90 |          30 |          |                |              |
      |               |                |               90 |             | LEADER   |                |              |
      |               |                |               90 |             |          | Deskripsi ubah |              |
      |               |                |               90 |             |          |                | ACTIVE       |
      |               |                |                  |          30 | STAFF    |                |              |
      |               |                |                  |          30 |          | Deskripsi ubah |              |
      |               |                |                  |          30 |          |                | ACTIVE       |
      |               |                |                  |             | LEADER   | Deskripsi ubah |              |

  @tag2
  Scenario Outline: TSMP018002 Admin edit tiga field  data modul
    When TSMP018002 Admin edit field <nama>, <tipe_modul>, <waktu_pengerjaan>, <jumlah_soal>, <kategori>, <deskripsi>, <status_modul> modul
    And TSMP018002 Admin klik tombol update
    And TSMP018002 Data modul berhasil diedit

   # Data ubah tiga field (14 Data)
    Examples: 
      | nama          | tipe_modul     | waktu_pengerjaan | jumlah_soal | kategori | deskripsi      | status_modul |
      | psikotestCoba | PILIHAN GANDA  |              100 |             |          |                |              |
      | psikotestCoba | ESAI FREE TEXT |                  |          60 |          |                |              |
      | psikotestCoba | PILIHAN GANDA  |                  |             | STAFF    |                |              |
      | psikotestCoba | ESAI FREE TEXT |                  |             |          | Deskripsi ubah |              |
      | psikotestCoba | PILIHAN GANDA  |                  |             |          |                | NON ACTIVE   |
      | psikotestCoba |                |              100 |          60 |          |                |              |
      | psikotestCoba |                |              100 |             | LEADER   |                |              |
      | psikotestCoba |                |              100 |             |          | Deskripsi ubah |              |
      | psikotestCoba |                |              100 |             |          |                | ACTIVE       |
      | psikotestCoba |                |                  |          60 | LEADER   |                |              |
      | psikotestCoba |                |                  |          60 |          | Deskripsi ubah |              |
      | psikotestCoba |                |                  |          60 |          |                | NON ACTIVE   |
      | psikotestCoba |                |                  |             | LEADER   | Deskripsi ubah |              |
      | psikotestCoba |                |                  |             | LEADER   |                | ACTIVE       |

  @tag3
  Scenario Outline: TSMP018003 Admin edit empat field data modul
    When TSMP018003 Admin edit field <nama>, <tipe_modul>, <waktu_pengerjaan>, <jumlah_soal>, <kategori>, <deskripsi>, <status_modul> modul
    And TSMP018003 Admin klik tombol update
    And TSMP018003 Data modul berhasil diedit

    #Data ubah empat field (10 Data)
    Examples: 
      | nama          | tipe_modul    | waktu_pengerjaan | jumlah_soal | kategori | deskripsi      | status_modul |
      | psikotestCoba | PILIHAN GANDA |               90 |          20 | LEADER   |                |              |
      | psikotestCoba | PILIHAN GANDA |               90 |          20 |          | Deskripsi ubah |              |
      | psikotestCoba | PILIHAN GANDA |               90 |          20 |          |                | ACTIVE       |
      | psikotestCoba | PILIHAN GANDA |               90 |          20 |          |                | ACTIVE       |
      |               | PILIHAN GANDA |               90 |             | LEADER   |                | ACTIVE       |
      |               | PILIHAN GANDA |               90 |             | STAFF    | Deskripsi ubah | ACTIVE       |
      |               | PILIHAN GANDA |               90 |             | STAFF    |                | NON ACTIVE   |
      |               | PILIHAN GANDA |                  |          20 | LEADER   |                | ACTIVE       |
      |               | PILIHAN GANDA |                  |          20 | STAFF    | Deskripsi ubah | ACTIVE       |
      |               | PILIHAN GANDA |                  |          20 | STAFF    |                | NON ACTIVE   |

  @tag4
  Scenario Outline: TSMP018004 Admin edit lima field  data modul
    When TSMP018004 Admin edit field <nama>, <tipe_modul>, <waktu_pengerjaan>, <jumlah_soal>, <kategori>, <deskripsi>, <status_modul> modul
    And TSMP018004 Admin klik tombol update
    And TSMP018004 Data modul berhasil diedit

    #Data ubah lima field (6 Data)
    Examples: 
      | nama          | tipe_modul     | waktu_pengerjaan | jumlah_soal | kategori | deskripsi      | status_modul |
      | psikotestCoba | ESAI FREE TEXT |               90 |             | STAFF    | Deskripsi ubah |              |
      | psikotestCoba | ESAI FREE TEXT |               90 |             | STAFF    |                | ACTIVE       |
      | psikotestCoba | ESAI FREE TEXT |                  |          20 | STAFF    |                | ACTIVE       |
      | psikotestCoba |                |               90 |          20 | STAFF    |                | ACTIVE       |
      |               | ESAI FREE TEXT |               90 |          20 | STAFF    |                | ACTIVE       |
      |               | ESAI FREE TEXT |               90 |          20 | STAFF    | Deskripsi ubah |              |

  @tag5
  Scenario Outline: TSMP018005 Admin edit enam field data modul
    When TSMP018005 Admin edit field <nama>, <tipe_modul>, <waktu_pengerjaan>, <jumlah_soal>, <kategori>, <deskripsi>, <status_modul> modul
    And TSMP018005 Admin klik tombol update
    And TSMP018005 Data modul berhasil diedit

   #Data ubah enam field (3 Data)
    Examples: 
      | nama          | tipe_modul     | waktu_pengerjaan | jumlah_soal | kategori | deskripsi      | status_modul |
      | psikotestCoba | ESAI FREE TEXT |               90 |             | STAFF    | Deskripsi ubah | ACTIVE       |
      | psikotestCoba | ESAI FREE TEXT |                  |          20 | STAFF    | Deskripsi ubah | ACTIVE       |
      |               | ESAI FREE TEXT |               90 |          20 | STAFF    | Deskripsi ubah | ACTIVE       |

  @tag6
  Scenario Outline: TSMP018006 Admin edit tujuh field data modul
    When TSMP018006 Admin edit field <nama>, <tipe_modul>, <waktu_pengerjaan>, <jumlah_soal>, <kategori>, <deskripsi>, <status_modul> modul
    And TSMP018006 Admin klik tombol update
    And TSMP018006 Data modul berhasil diedit

    Examples: 
      | nama          | tipe_modul     | waktu_pengerjaan | jumlah_soal | kategori | deskripsi      | status_modul |
      | psikotestCoba | ESAI FREE TEXT |               90 |          20 | STAFF    | Deskripsi ubah | ACTIVE       |
