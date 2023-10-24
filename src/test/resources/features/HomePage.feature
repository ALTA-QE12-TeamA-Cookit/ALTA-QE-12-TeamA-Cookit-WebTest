@HomePage
Feature: HomePage

  @positive
  Scenario: User go to timeline tab
  Given User already on Cookit landing page
  When user click sign in button
  And user input username "test5"
  And input password "Test1234"
  And click Log in button
  When User click on Timeline tab
  Then User already on Timeline tab

  @Positive
  Scenario: User go to recipe tab
  Given User already on Cookit landing page
  When user click sign in button
  And user input username "test5"
  And input password "Test1234"
  And click Log in button
  When User click on Recipes tab
  Then User already on Recipes tab