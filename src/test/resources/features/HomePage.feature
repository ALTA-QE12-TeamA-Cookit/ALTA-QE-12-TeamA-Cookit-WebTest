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

    @Positive
    Scenario: User go to recipes page
    Given User already on Cookit landing page
      When user click sign in button
      And user input username "test5"
      And input password "Test1234"
      And click Log in button
      When User click on Recipes name
      Then User already on Recipes page

      @Positive
      Scenario: User go to search page
      Given User already on Cookit landing page
        When user click sign in button
        And user input username "test5"
        And input password "Test1234"
        And click Log in button
        And User click on Search icon
        Then User already on Search page

      @Positive
        Scenario: User go to profile page
          Given User already on Cookit landing page
          When user click sign in button
          And user input username "test5"
          And input password "Test1234"
          And click Log in button
          And User click on profile icon
          And User click on prifile menu button
          Then User already on profile page

      @Positive
      Scenario: User add item to cart
        Given User already on Cookit landing page
        When user click sign in button
        And user input username "test5"
        And input password "Test1234"
        And click Log in button
        And User click add to cart icon button on home page
        Then pop up with message "successfuly added to cart" is shown

      @Positive
      Scenario: User go to cart page
        Given User already on Cookit landing page
        When user click sign in button
        And user input username "test5"
        And input password "Test1234"
        And click Log in button
        And User click on Cart icon
        Then User already on Cart page

      @Positive
      Scenario: User go to post page
        Given User already on Cookit landing page
        When user click sign in button
        And user input username "test5"
        And input password "Test1234"
        And click Log in button
        And User click on Timeline tab
        When User click on Timeline photo
        Then User already on Timeline page

      @Positive
      Scenario: User go to add new cooking page
        Given User already on Cookit landing page
        When user click sign in button
        And user input username "test5"
        And input password "Test1234"
        And click Log in button
        And User click on new post button
        When User click on new cooking button
        Then User already on new cooking page

      @Positive
      Scenario: User go to add new recipes page
        Given User already on Cookit landing page
        When user click sign in button
        And user input username "test5"
        And input password "Test1234"
        And click Log in button
        And User click on new post button
        When User click on new recipe button
        Then User already on new recipe page

    @Positive
    Scenario: User like content in timeline tab on home page
      Given User already on Cookit landing page
      When user click sign in button
      And user input username "test5"
      And input password "Test1234"
      And click Log in button
      When User click on Timeline tab
      And User click like icon
      Then The number of likes changes

    @Positive
    Scenario: User comment content in timeline tab on home page
      Given User already on Cookit landing page
      When user click sign in button
      And user input username "test5"
      And input password "Test1234"
      And click Log in button
      When User click on Timeline tab
      And User click comment icon
      Then User redirected to make comments page
