@SignIn
Feature: Sign In
  As a user i want login to cookit page

  @positive
  Scenario: Sign In With Valid Data
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test6"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"

  @Negative
  Scenario: Sign In with unregistered username
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "username10"
    And input password "Username1"
    And click Log in button
    Then warning pop-up should shown

  @Negative
  Scenario: Sign In with wrong password
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "username10"
    And input password "sdsername1"
    And click Log in button
    Then warning pop-up should shown

  @Negative
  Scenario: Sign In with empty username
    Given User already on Cookit landing page
    When user click sign in button
    And user input username ""
    And input password "Username1"
    And click Log in button
    Then warning pop-up should shown

  @Negative
  Scenario: Sign In with empty password
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "username1"
    And  input password ""
    And click Log in button
    Then warning pop-up should shown
