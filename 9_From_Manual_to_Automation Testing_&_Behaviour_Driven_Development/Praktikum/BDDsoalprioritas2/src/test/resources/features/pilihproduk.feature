Feature: Sepulsa choose product

  @ChooseProduct @NormalPositive
  Scenario: Choose product and fill the required data
    Given user is on Sepulsa login page
    And user input correct username
    And user input correct password
    Then user is on Sepulsa main page
    And user choose the product
    And user fill the required data
    Then user can continue to pay the bill

  @ChooseProduct @NormalNegative
  Scenario: Choose product and fill the required data with symbol only
    Given user is on Sepulsa login page
    And user input correct username
    And user input correct password
    Then user is on Sepulsa main page
    And user choose the product
    And user fill the required data with symbol
    Then user data cannot be saved and still need to fill the required data

  @ChooseProduct @NormalNegative
  Scenario: Choose product and fill the required data with zero only
    Given user is on Sepulsa login page
    And user input correct username
    And user input correct password
    Then user is on Sepulsa main page
    And user choose the product
    And user fill the required data with zero
    Then user data cannot be saved and still need to fill the required data
