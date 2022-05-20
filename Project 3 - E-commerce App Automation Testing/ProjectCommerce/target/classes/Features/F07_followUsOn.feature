@regression
Feature: F07_followUsOn | user should be able to open follow us links
  Scenario: user opens facebook link
    When user click on facebook link
    Then facebook page opens in a new tab

  Scenario: user opens twitter link
    When user click on twitter link
    Then twitter page opens in a new tab

  Scenario: user opens rss link
    When user click on rss link
    Then rss page opens in a new tab

  Scenario: user opens youtube link
    When user click on youtube link
    Then youtube page opens in a new tab