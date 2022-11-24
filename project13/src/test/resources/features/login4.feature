Feature: working on web application

  Scenario: web application
    Given user is in newtours
    When user need to enter <username> and <password>
    Then user clicks the  button
    And user takes screenshot and closes the page
