@Admin
Feature: Verify User

  @positive
  Scenario: Admin verify user on verify user page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "admin"
    And input password "admin"
    And click Log in button
    Then Admin already on Home Page
    When Admin click on Profile menu
    And Admin click on verify users menu
    And Admin already on Verify Users page
    Then Admin click checklist button on selected user