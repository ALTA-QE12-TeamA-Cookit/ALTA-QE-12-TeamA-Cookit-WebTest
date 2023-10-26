@Login
Feature: Login
  As a user i want login to cookit page

  @positive @test
  Scenario: Login With Valid Data
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"

  @Negative @test
  Scenario: Log in with unregistered username
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "username10"
    And input password "Username1"
    And click Log in button
    Then warning pop-up should shown

  @Negative @test
  Scenario:Log in with wrong password
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "username10"
    And input password "sdsername1"
    And click Log in button
    Then warning pop-up should shown

  @Negative @test
  Scenario:Log in with empty username
    Given User already on Cookit landing page
    When user click sign in button
    And user input username ""
    And input password "Username1"
    And click Log in button
    Then warning pop-up should shown

  @Negative @test
  Scenario: Log in with empty password
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "username1"
    And  input password ""
    And click Log in button
    Then warning pop-up should shown
