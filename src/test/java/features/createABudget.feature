Feature: Set Income

  Scenario: Create a new income budget of $450
    Given I open the set income modal
    When I enter '450' as the income
    When I close the set income modal
    Then Income is set to $'450'