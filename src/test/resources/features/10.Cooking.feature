@Cooking
Feature: Cooking
  As a user i want to make a new cooking

  @Positive
  Scenario: Create new cooking with input field text and input img with valid data on new cooking page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test6"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click new cooking button
    And User input text field with "hallow selamat pagi"
    And User input image with "C:\Users\AL\IntellijIdeaProject\Unit_3\Alta-QE12-TeamA-Cookit-WebTest\src\test\resources\images\2.jpeg"
    And User click submit button
    Then pop-up should return message with "successfuly added new cooking"

  @Negative
  Scenario: Create new cooking with Input field text and input img with valid data and image more than 3MB on new cooking page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test6"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click new cooking button
    And User input text field with "Selamat malam"
    And User input image with "C:\Users\AL\IntellijIdeaProject\Unit_3\Alta-QE12-TeamA-Cookit-WebTest\src\test\resources\images\More3MB.png"
    And User click submit button
    Then pop-up should return message with "Oops, file size more than 3MB"

  @Negative
  Scenario: Create new cooking with input images without text on new cooking page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test6"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click new cooking button
    And User input text field with ""
    And User input image with "C:\Users\AL\IntellijIdeaProject\Unit_3\Alta-QE12-TeamA-Cookit-WebTest\src\test\resources\images\1.png"
    And User click submit button
    Then pop-up should return message with "text field can't be blank"

  @Negative
  Scenario: Create new cooking with input field text without image on new cooking page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test6"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click new cooking button
    And User input text field with "Hallow selamat pagi"
    And User click submit button
    Then pop-up should return message with "successfuly added new cooking"

  @Negative
  Scenario: Create new cooking without any value on new cooking page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test6"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click new cooking button
    And User click submit button
    Then pop-up should return message with "text field can't be blank"

  @Positive
  Scenario: Comment on someone cooking post
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test6"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click timeline tab
    And User click first button comment cooking post
    When User input comment on cooking post with "Hallow semuanya"
    Then User click submit button

  @Positive
  Scenario: Like on someone cooking post
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test6"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click timeline tab
    And User click first button comment cooking post
    Then Like on someone cooking post