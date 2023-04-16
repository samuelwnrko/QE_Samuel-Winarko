Feature: checkout product at saucedemo.com

  @Checkout @NormalPositive
  Scenario: Checkout product at saucedemo and inputting data
    Given user is on saucedemo login page
    And user input accepted username
    And user input password for all user
    And user click login
    Then user can login and go to main page
    And user choose product
    Then the product is at the cart
    And user click checkout
    And user input data
    And user click continue
    Then user can checkout product

  @Checkout @NormalNegative
  Scenario: Checkout product at saucedemo but did not inputting data
    Given user is on saucedemo login page
    And user input accepted username
    And user input password for all user
    And user click login
    Then user can login and go to main page
    And user choose product
    Then the product is at the cart but only one
    And user click checkout
    And user click continue
    Then user still at the checkout page for inputting data