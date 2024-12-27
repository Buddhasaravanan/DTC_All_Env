#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@StressTest
Feature: Strees Test
  Users login simultaneously and hit the settings page

  @StressTest1
  Scenario: Multiple login and hit the settings page
    Given the user should be navigate to login page
    When the user entering valid login credentials
    And the user click sign in button
    And the user select the company
    Then the user should navigate to dashboard page
    When the user click opportunity from main menu
    And the user click new opportunity button
    And the user entring opportunity name
    And the user select bulding type
    And the user entering budget of opportunity
    And the user entering sqfeet of opportunity
    And the user select project type and market type
    And the user select quote type
    And the user entering client name
    And the user click next button
    And the user click create button
    When the user go to new quote and design section
    And the user search item
    And the user add item to quote
    Then validating item added to quote
    When the user add accessory to item
    Then validating accessory added to quote
    When the user add new adjestment to quote
    Then Validating new adjestment added to quote
    When the user create new optional location
    Then Validating new optional location created
    When the user search labor
    And the user add labor to quote
    Then Validating labor added to quote
    When the user add exsiting service plan to quote
    Then validating service plan added or not
    When the user create new multimedia proposal
    And the user go to present proposal and accept the proposal
    And the user make payment via DTP
    And the user won the opportunity
    Then Validating new project created
   
