#Author: Ayu
#Created Date : 2/10/2022
#Modified Date :
Feature: TSMP003 Admin tambah modul

  Background: 
    Given TSMP003 Admin berhasil membuka form add data modul

  @tag1
  Scenario Outline: TSMP003 Admin ingin menambahkan modul
    When TSMP003 Admin klik input <nama_modul>, <tipe_modul>, <kategori>, <deskripsi> dan <status_modul>
    And TSMP003 Admin klik save
    And TSMP003 Admin klik ok
    Then TSMP003 Data modul baru berhasil ditambahkan

    Examples: 
      | nama_modul   | tipe_modul      | kategori | deskripsi      | status_modul |
      | pikotestCoba | PILIHAN GANDA   | LEADER   | Deskripsi Test | ACTIVE       |
      | pikotestCoba | PILIHAN GANDA   | STAFF    | Deskripsi Test | ACTIVE       |
      | pikotestCoba | PILIHAN GANDA   | STAFF    | Deskripsi Test | NON ACTIVE   |
      | pikotestCoba | PILIHAN GANDA   | LEADER   | Deskripsi Test | NON ACTIVE   |
      | pikotestCoba | ESAI FREE TEXT  | LEADER   | Deskripsi Test | ACTIVE       |
      | pikotestCoba | ESAI FREE TEXT  | STAFF    | Deskripsi Test | ACTIVE       |
      | pikotestCoba | ESAI FREE TEXT  | STAFF    | Deskripsi Test | NON ACTIVE   |
      | pikotestCoba | ESAI FREE TEXT  | LEADER   | Deskripsi Test | NON ACTIVE   |
      | pikotestCoba | ENUM (YA/TIDAK) | LEADER   | Deskripsi Test | ACTIVE       |
      | pikotestCoba | ENUM (YA/TIDAK) | STAFF    | Deskripsi Test | ACTIVE       |
      | pikotestCoba | ENUM (YA/TIDAK) | STAFF    | Deskripsi Test | NON ACTIVE   |
      | pikotestCoba | ENUM (YA/TIDAK) | LEADER   | Deskripsi Test | NON ACTIVE   |
      | pikotestCoba | ESAI LENGTH     | LEADER   | Deskripsi Test | ACTIVE       |
      | pikotestCoba | ESAI LENGTH     | STAFF    | Deskripsi Test | ACTIVE       |
      | pikotestCoba | ESAI LENGTH     | STAFF    | Deskripsi Test | NON ACTIVE   |
      | pikotestCoba | ESAI LENGTH     | LEADER   | Deskripsi Test | NON ACTIVE   |
      | pikotestCoba | PILIHAN A/B     | LEADER   | Deskripsi Test | ACTIVE       |
      | pikotestCoba | PILIHAN A/B     | STAFF    | Deskripsi Test | ACTIVE       |
      | pikotestCoba | PILIHAN A/B     | STAFF    | Deskripsi Test | NON ACTIVE   |
      | pikotestCoba | PILIHAN A/B     | LEADER   | Deskripsi Test | NON ACTIVE   |
