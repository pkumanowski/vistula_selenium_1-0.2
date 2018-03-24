Feature: Login
  Scenario: Admin user successful login
    Given I open login page
    When I enter email "administrator@testarena.pl"
    And  I enter password "sumXQQ72$L"
    And I click login button
    Then I am logged in
    And I wait 3 seconds seconds

    Scenario: Unsuccessful login without credentials
      Given I open login page
      When I click login button
      And I wait 3 seconds seconds
      Then I not am logged in
