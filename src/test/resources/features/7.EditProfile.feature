@EditProfile
Feature: Edit Profile
  As a user i want login to do something in edit profile page

  @Negative
  Scenario: Edit username with username is empty
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test100"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input username with ""
    And User click save button
    Then pop-up message should return "username shouldn't be blank"

  @Positive
  Scenario: Edit username and edit bio with valid value
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test100"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input username with "test200"
    And User input bio with "Welcome to my profile how are u?"
    And User click save button
    Then pop-up should return message with "Update profile has been successful"

  @Negative
  Scenario: Edit username with user already exists
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test200"
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

  @Positive
  Scenario: Change password with valid value
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test200"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input current_password field with "Test1234"
    And User input new_password field with "Test12345"
    And User input confirm_password field with "Test12345"
    And User click save button
    Then pop-up message should return "Update profile has been successful"

  @Negative
  Scenario: Change password without any requirement
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test200"
    And input password "Test12345"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input current_password field with "Test12345"
    And User input new_password field with "test"
    And User input confirm_password field with "test"
    And User click save button
    Then pop-up message should return "Password doesn't meet requirement"

  @Negative
  Scenario: Change password with at least 1 upper case letter only
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test200"
    And input password "test"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input current_password field with "test"
    And User input new_password field with "Test"
    And User input confirm_password field with "Test"
    And User click save button
    Then pop-up message should return "Password doesn't meet requirement"

  @Negative
  Scenario: Change password with at least 1 upper case letter only and at least 8 characters without space
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test200"
    And input password "Test"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input current_password field with "Test"
    And User input new_password field with "TestingA"
    And User input confirm_password field with "TestingA"
    And User click save button
    Then pop-up message should return "Password doesn't meet requirement"

  @Negative
  Scenario: Change password with all requirement but with spaces
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test200"
    And input password "TestingA"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input current_password field with "TestingA"
    And User input new_password field with "Test 8 Test"
    And User input confirm_password field with "Test 8 Test"
    And User click save button
    Then pop-up message should return "Update profile has been successful"

  @Negative
  Scenario: Change password with number only
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test200"
    And input password "Test 8 Test"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input current_password field with "Test 8 Test"
    And User input new_password field with "1234"
    And User input confirm_password field with "1234"
    And User click save button
    Then pop-up message should return "Password doesn't meet requirement"

  @Positive
  Scenario: Request to be verified
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test200"
    And input password "1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User click on request button
    Then pop-up message should return "Request has been successful"

  @Positive
  Scenario: Change profile picture
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test200"
    And input password "1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User update profile image from edit profile page "C:\Users\arifl\Documents\!LearnJava\Unit 3\Alta-QE12-TeamA-Cookit-WebTest\src\test\resources\images\2.jpeg"
    Then pop-up message should return "Update profile has been successful"

  Scenario: Change password with valid value
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test200"
    And input password "1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click on Profile menu
    And User click on Profile list menu
    And User click on Edit profile icon
    And User input username with "test100"
    And User input current_password field with "1234"
    And User input new_password field with "Test1234"
    And User input confirm_password field with "Test1234"
    And User click save button
    Then pop-up message should return "Update profile has been successful"