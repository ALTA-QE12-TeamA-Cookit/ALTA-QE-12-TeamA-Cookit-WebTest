@MyPurchase
Feature: MyPurchase
  As a user i want check my purchase history

  @Positive
  Scenario: Copy VA Number on detail my from my purchase page
  Given User already on Cookit landing page
  When user click sign in button
  And user input username "test10"
  And input password "Test1234"
  And click Log in button
  Then pop-up should return message with "sign in has been successful"
  When User click on Profile menu
  And User click my purchase
  And User click pay on my purchase page
  Then User click copy icon on detail purchase



