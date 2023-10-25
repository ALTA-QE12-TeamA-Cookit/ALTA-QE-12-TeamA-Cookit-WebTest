@Cart
Feature: CartPage

  @positive
  Scenario: User checkout item
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on Cart icon
    Then User already on Cart page
    And User click checkbox on selected item
    And User verify total price
    And User click checkout button
    Then User already on payment page

  @positive
  Scenario: User remove item on cart page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on add to cart icon
    And User click on Cart icon
    Then User already on Cart page
    And User click remove item icon
    Then pop up with message "Delete has been successful" has shown

  @positive
  Scenario: User add more quantity item on cart page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on Cart icon
    Then User already on Cart page
    And User click plus icon for adding more quantity product
    Then quantity product change value

  @positive
  Scenario: User reduce quantity item on cart page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on Cart icon
    Then User already on Cart page
    And User click minus icon for adding more quantity product
    Then quantity product change value

  @positive
  Scenario: User place order item on cart page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "test5"
    And input password "Test1234"
    And click Log in button
    And User click on add to cart icon
    And User click on Cart icon
    And User click checkbox on selected item
    And User verify total price
    And User click checkout button
    Then User already on payment page
    And User click delivery option GO FOOD
    And User click payment option
    And User click Bank BCA
    And User click Place Order button
    And User input "Test1234" as password
    And User click confirm button
    Then Pop up with message "Successfull Order" is shown
    And User redirect to detail purchase page

  @positive
  Scenario: User recieved the order on my purchase page
    Given User already on Cookit landing page
    When user click sign in button
    And user input username "kamui123"
    And input password "Kamui123"
    And click Log in button
    And User click on profile icon
    And User click my purchase menu
    When User already on my purchase page
    And User click on recieved tab
    And User click Order Recieved button on selected product
    And User click complete tab
    Then Recieved product has shown on complete tab