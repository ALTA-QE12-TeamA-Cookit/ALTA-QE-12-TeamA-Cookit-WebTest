@Profile
Feature: Profile
  As a user i want login to do something in profile page

  #OwnProfilePage
  @Positive
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

  @Positive
  Scenario: Like new cooking post from profile page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    And User click like icon on profile page
    Then Verify like value is "1"

  @positive
  Scenario: Verify user already on cooking page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    And User click comment on profile page
    Then Verify user already on cooking page

  @Positive
  Scenario: Create recooked reciped from profile page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    And User click more button on profile page
    And User click recook icon on profile page
    When User click submit button on recook page
    Then Verify user already on recipe page

  @Positive
  Scenario: Open another profile from profile page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test10"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    When User click on profile from recooked
    Then Verify between username on recooked and on username profile

  @Positive
  Scenario: Add to cart item from profile page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test10"
    And input password "Test1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    And User click on Profile menu
    And User click on Profile list menu
    When User click add to cart on profile page
    Then pop-up message should return "successfuly added to cart"

  #AnotherProfilePage

  @Positive
  Scenario: Follow user through timeline
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "akoi2"
    And input password "Akoi1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click first profile on timeline
    And User click follow button on that profile
    Then pop-up swal body should return message with "successfuly follow this user"

  @Positive
  Scenario: Verify after following someone, follow button become unfollow state
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "akoi2"
    And input password "Akoi1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click first profile on timeline
    And Verify button name is Unfollow

  @Positive
  Scenario: Unfollow user through timeline
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "akoi2"
    And input password "Akoi1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click first profile on timeline
    And User click follow button on that profile
    Then pop-up swal body should return message with "successfuly unfollow this user"

  @Positive
  Scenario: Verify button comment new cooking post from another profile page is working
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "akoi2"
    And input password "Akoi1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click first profile on timeline
    And User click comment on profile page
    Then Verify user already on cooking page

  @Positive
  Scenario: Like new cooking post from profile page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "akoi2"
    And input password "Akoi1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click first profile on timeline
    And User click like icon on profile page
    Then Verify like value is "1"

  @Positive
  Scenario: Add to cart item from profile page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "akoi2"
    And input password "Akoi1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click first profile on timeline
    And User click add to cart on profile page
    Then pop-up message should return "successfuly added to cart"

  @Positive
  Scenario: Create recooked reciped from profile page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "akoi2"
    And input password "Akoi1234"
    And click Log in button
    Then pop-up should return message with "sign in has been successful"
    When User click first profile on timeline
    And User click button more on another profile page
    And User click recooked button
    And user input recipe title with "Sapi Goreng"
    And User click submit button
    Then Verify status recooked is displayed
