@Login
Feature: Login
  As a user i want login to cookit page

  @positive
  Scenario: Login With Valid Data
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"