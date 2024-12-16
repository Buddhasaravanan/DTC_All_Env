Feature: Login Test
  I want to use this template for my feature file

  @Sanity
  Scenario: Login with valid login credentials
    Given the user should be navigate to login page
    When the user entering valid login credentials
    And the user click sign in button
    And the user select the company
    Then the user should navigate to dashboard page
