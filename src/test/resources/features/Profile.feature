@Profile
Feature: Profile
  As a user i want login to do something in profile page

  #OwnProfilePage
  @positive
  Scenario: Delete new cooking post from profile page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    When User click first button more on new cooking post
    And User click Delete Post
    Then pop-up message should return "Successfuly Deleted Post"
