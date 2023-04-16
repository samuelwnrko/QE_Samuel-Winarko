Feature: choose product at saucedemo.com

  @ChooseProduct @NormalPositive
  Scenario: Choose product at saucedemo
    Given user is on saucedemo login page
    And user input accepted username
    And user input password for all user
    And user click login
    Then user can login and go to main page
    And user choose product
    Then the product is at the cart

  @ChooseProduct @NormalNegative
  Scenario: Choose 2 same product at saucedemo
    Given user is on saucedemo login page
    And user input accepted username
    And user input password for all user
    And user click login
    Then user can login and go to main page
    And user choose product
    Then the product is at the cart but only one