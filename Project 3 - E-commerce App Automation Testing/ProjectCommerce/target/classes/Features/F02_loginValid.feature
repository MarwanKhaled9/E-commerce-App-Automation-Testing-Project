@regression
Feature: user should be able to login to the system
  Scenario: user login with valid username and password
    Given user navigate to login page

    When user enter a valid username and password
    And user click on login button
    #expected result
    Then user could login successfully and goto home page


