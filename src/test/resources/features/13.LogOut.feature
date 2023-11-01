@LogOut
Feature: Log Out
  As a user i want to Log out may Account

  @Positive
  Scenario: User want to log out account
    Given User already on Cookit page
    When User click on Sign In button
    And User input "badaklaut" as username and "Badaklaut1" as password
    And User click login button
    And User click on profile menu
    When User click logout
    And Verify logout pop up is displayed
    And User click yes
    Then user back to login page
