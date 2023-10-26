@Follower
Feature: Follower Page

  @positive
  Scenario: User click follow back button on followers page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on profile icon
    And User click on profile menu buttons
    Then User already on profile page
    And User click on followers button in profile page
    When User click on Followers tab
    When User click on Follow Back button and refresh page
    Then Follow Back button text should change to "Friend"