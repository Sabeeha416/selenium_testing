Feature: web application

  Scenario: working on amazon page
    Given amazon page
    When page is opened
    Then user need to capture all links
    And stores the links in excelsheet and closes the window
