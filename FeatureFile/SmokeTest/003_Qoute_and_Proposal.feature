Feature: Qoute and proposal

  @sanity
  Scenario: Basic functionality test for quote and proposal
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
