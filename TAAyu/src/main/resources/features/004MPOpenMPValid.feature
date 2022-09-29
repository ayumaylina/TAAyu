#Author: Ayu
#Created Date : 29/9/2022
#Modified Date : 
Feature: Admin login valid ke web
	Background:
	    Given Admin go to page login

	@tag1
  Scenario: Admin login valid click button signin
    When TSLP001001 admin enter username and password valid
    Then TSLP001001 The system check credentsial login valid
