@regression
Feature: user should be able to register on the system successfully
  Scenario: user register with valid on the system
    Given user navigate to register tab
    When user fill his Personal Details
    And fill company name
    And fill password fields
    And user click on register button
    #expected result
    Then user could register successfully and goto home page