#Author: Bagas
#Created_date: 4/10/2022
#Modified_date: 5/10/2022
#Modifier: Ayu
@tag
Feature: TSMP021 Delete deskripsi
	Background:
		Given TSMP021 Admin sudah membuka tambah deskripsi
		

  @tag1
  Scenario: TSMP021001 Admin delete data descriptions yang tersimpan
    When TSMP021001 Admin klik delete
    Then TSMP021001 Muncul pop up delete
    And TSMP021001 Admin klik TIDAK
    
  @tag2
  Scenario: TSMP021002 Admin delete data descriptions yang tersimpan
    When TSMP021002 Admin klik delete
    And TSMP021002 Admin klik YA
    Then TSMP021002 Muncul pop up data telah dihapus
    And TSMP021002 Admin klik OK