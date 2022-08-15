Feature: Login to SauceDemo

  Scenario Outline: Login to SauceDemo
    Given user wants to login as standard user
    When user fills in "<Username>" and "<Password>" fields
    And user clicks on Login button
    Then user proceeds to Inventory page
    Examples:
      | Username                | Password     |
      | standard_user           | secret_sauce |
