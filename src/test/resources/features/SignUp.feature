@Signup
Feature:
  As a user i want signup to cookit page

  @Positive
  Scenario Outline: Create new user with valid data
    Given user on landing page
    When user click sign in buttons
    And user on login page
    And user click sign up button
    And user input  "<username>", "<email>", "<password>"
    And click Sign up button
    Then pop-up return should be shown
    Examples:
      | username    | email                 | password    |
      | username100 | username100@email.com | Username100 |

#    Please new input unique "<username>" and "<email>"!!!

  @Negative
  Scenario Outline: Create user with registered username
    Given user on landing page
    When user click sign in button
    And user click sign up button
    And user input  "<username>", "<email>", "<password>"
    And click Sign up button
    Then warning pop-up should be same with "<message>"
    Examples:
      | username  | email               | password  | message  |
      | username1 | username2@email.com | Username2 | username already exist|

  @Negative
  Scenario Outline: Create user with registered email
    Given user on landing page
    When user click sign in button
    And user click sign up button
    And user input  "<username>", "<email>", "<password>"
    And click Sign up button
    Then warning pop-up should be same with "<message>"
    Examples:
      | username  | email               | password  | message       |
      | username2 | username1@email.com | Username2 | email already registered|

  @Negative
  Scenario Outline: Create user with empty username
    Given user on landing page
    When user click sign in button
    And user click sign up button
    And user input  "<username>", "<email>", "<password>"
    And click Sign up button
    Then warning pop-up should be same with "<message>"
    Examples:
      | username | email               | password  | message                                          |
      |          | username1@email.com | Username2 | Please input your email, username and password.. |

  @Negative
  Scenario Outline: Create user with empty email
    Given user on landing page
    When user click sign in button
    And user click sign up button
    And user input  "<username>", "<email>", "<password>"
    And click Sign up button
    Then warning pop-up should be same with "<message>"
    Examples:
      | username  | email | password  | message                                          |
      | username2 |       | Username2 | Please input your email, username and password.. |

  @Negative
  Scenario Outline: Create user with empty password
    Given user on landing page
    When user click sign in button
    And user click sign up button
    And user input  "<username>", "<email>", "<password>"
    And click Sign up button
    Then warning pop-up should be same with "<message>"
    Examples:
      | username  | email               | password | message                                          |
      | username2 | username1@email.com |          | Please input your email, username and password.. |

  @Negative
  Scenario Outline: Create user with invalid format email
    Given user on landing page
    When user click sign in button
    And user click sign up button
    And user input  "<username>", "<email>", "<password>"
    And click Sign up button
    Then warning pop-up should be same with "<message>"
    Examples:
      | username  | email              | password  | message |
      | username2 | username1email.com | Username2 | invalid email format|

  @Negative
  Scenario Outline: Create user with password less than 8 char.
    Given user on landing page
    When user click sign in button
    And user click sign up button
    And user input  "<username>", "<email>", "<password>"
    And click Sign up button
    Then first condition password should be shown
    Examples:
      | username | email | password |
      |          |       | User2    |

  @Negative
  Scenario Outline: Create user with lowercase password
    Given user on landing page
    When user click sign in button
    And user click sign up button
    And user input  "<username>", "<email>", "<password>"
    And click Sign up button
    Then second condition password should be shown
    Examples:
      | username | email | password  |
      |          |       | username2 |

  @Negative
  Scenario Outline: Create user without number in password
    Given user on landing page
    When user click sign in button
    Then user click sign up button
    And user input  "<username>", "<email>", "<password>"
    And click Sign up button
    Then third condition password should be shown
    Examples:
      | username | email | password |
      |          |       | Username |