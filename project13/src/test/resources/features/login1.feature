Feature: working on login window

  Scenario Outline: web application
    Given user is in newtours application
    When user needs to enter <uname> and <password>
    Then use click on submit button
    And user navigated to home page

    Examples: 
      | uname   | password |
      | mercury | mercury  |
