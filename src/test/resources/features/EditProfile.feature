@EditProfile
Feature: Edit Profile
  As a user i want login to do something in edit profile page

  @positive
  Scenario: Edit username with username is empty
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input username with ""
    And User click save button
    Then pop-up message should return "username shouldn't be blank"

  @positive
  Scenario: Edit username and edit bio with valid value
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input username with "test20"
    And User input bio with "Welcome to my profile how are u?"
    And User click save button
    Then pop-up message should return "Update profile has been successful"

  @positive @TEST
  Scenario: Edit username with user already exists
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test20"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input username with "test1"
    And User input bio with "Welcome to my profile how are u?"
    And User click save button
    Then pop-up message should return "username already exists"