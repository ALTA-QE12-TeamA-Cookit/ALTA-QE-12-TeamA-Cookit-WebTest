@Search
Feature: Search

  @positive
  Scenario: User go to search page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on Search icon
    Then User already on Search page

  @positive
  Scenario: User search available recipes on search page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on Search icon
    Then User already on Search page
    And User input "ayam bakar madu" on search box
    Then Recipes contains word "ayam bakar madu" has shown

  @positive
  Scenario: User search available people on search page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on Search icon
    Then User already on Search page
    And User click on search people tab
    And User input "kamui123" on people search box
    Then People contains word "kamui123" has shown