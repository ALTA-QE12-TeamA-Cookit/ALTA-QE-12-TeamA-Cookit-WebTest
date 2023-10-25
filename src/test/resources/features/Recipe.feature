@Recipe
Feature: Recipe
  As a user i want to make a new recipe

  @Positive
  Scenario: Create new recipe Input all field on recipe with valid value and unverified user from recipe page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test10"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click new recipe button
    And user input recipe title with "Ayam bakar goreng"
    And user input description with "Ayam bakar goreng adalah ayam ya dibakar terus di goreng"
    And user input image with "C:\Users\arifl\Documents\!LearnJava\Unit 3\Alta-QE12-TeamA-Cookit-WebTest\src\test\resources\images\3.jpeg"
    And user input ingridient name with "Ayam"
    And user input quantity with "1"
    And user input unit with "potong"
    And user click add button on ingridient section
    And user click remove button on ingridient section
    And user input on step field with "Potong ayam jadi 8 potong"
    And user click add button on direction section
    And user click remove button on direction section
    And user click submit
    Then validate title recipe is "Ayam bakar goreng"

  @Positive
  Scenario: Create new recipe with Input all field on recipe with valid value and verified user from recipe page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click new recipe button
    And user input recipe title with "Ayam bakar goreng"
    And user input description with "Ayam bakar goreng adalah ayam ya dibakar terus di goreng"
    And user input image with "C:\Users\arifl\Documents\!LearnJava\Unit 3\Alta-QE12-TeamA-Cookit-WebTest\src\test\resources\images\3.jpeg"
    And user input ingridient name with "Ayam"
    And user input quantity with "1"
    And user input unit with "potong"
    And user click add button on ingridient section
    And user click remove button on ingridient section
    And user input on step field with "Potong ayam jadi 8 potong"
    And user click add button on direction section
    And user click remove button on direction section
    And user click checklist sell ingredient
    And user input on field price with "10000"
    And user click submit
    Then validate title recipe is "Ayam bakar goreng"
    And validate "ADD TO CART" button is displayed

  @Positive
  Scenario: Edit post on recipe with valid value and verified user
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    And User click on recipe title on profile page
    And User click on more button inside recipe page
    And User click edit post on recipe page
    And user input recipe title with "Ayam bakar goreng edit"
    And user input description with "Ayam bakar goreng adalah ayam ya dibakar terus di goreng edit"
    And user input image with "C:\Users\arifl\Documents\!LearnJava\Unit 3\Alta-QE12-TeamA-Cookit-WebTest\src\test\resources\images\2.jpeg"
    And user input ingridient name with "Ayam"
    And user input quantity with "1"
    And user input unit with "potong"
    And user click add button on ingridient section
    And user click remove button on ingridient section
    And user input on step field with "Potong ayam jadi 8 potong"
    And user click add button on direction section
    And user click remove button on direction section
    And user input on field price with "50000"
    And user click submit
    Then validate title recipe is "Ayam bakar goreng edit"
    And validate "ADD TO CART" button is displayed

  @Positive
  Scenario: Add to cart recipe from recipe page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    And User click on recipe title on profile page
    When User adjust the ingredient for how much portion
    When User click add to cart button
    Then pop-up message should return "successful add to cart"

  @Positive
  Scenario: Verify like recipe is working properly from recipe page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    And User click on recipe title on profile page
    Then User like on someone cooking recipe

  @Positive
  Scenario: Verify comment recipe post from recipe page without img from recipe page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    And User click on recipe title on profile page
    When User input comment on text area as "Hallow semuanya"
    Then User click submit button

  @Positive
  Scenario: Verify comment recipe post from recipe page with img
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    And User click on recipe title on profile page
    When User input comment on text area as "Hallow semuanya"
    And User input image with "C:\Users\arifl\Documents\!LearnJava\Unit 3\Alta-QE12-TeamA-Cookit-WebTest\src\test\resources\images\1.png"
    Then User click submit button

  @Positive
  Scenario: Verify that profile redirect from recipe page to profile page is same
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    And User click on recipe title on profile page
    When User click on first profile page from recipe page
    Then Username must be same with "test5"


  @Positive
  Scenario: Delete recipe post from recipe page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    And User click on recipe title on profile page
    And User click on more button inside recipe page
    And User click Delete Post
    Then pop-up message should return "Successfuly Deleted Post"

