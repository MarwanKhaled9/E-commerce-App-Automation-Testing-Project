@regression
Feature: F06_homeSliders | users will be able to open sliders in home page
  Scenario: first slider is clickable on home page
    When user click on first slider
    Then relative product of the first slider is displayed

  Scenario: second slider is clickable on home page
    When user click on second slider
    Then relative product of the second slider is displayed