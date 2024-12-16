Feature: Create New Opportunity

  @Sanity
  Scenario: Create New Opportunity
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
    Then validate the opportunity created or not
    