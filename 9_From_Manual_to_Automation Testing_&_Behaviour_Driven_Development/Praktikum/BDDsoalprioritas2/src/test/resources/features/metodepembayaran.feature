Feature: Sepulsa paying method

  @PayingMethod @NormalPositive
  Scenario: User choose paying method
    Given user is on Sepulsa login page
    And user input correct username
    And user input correct password
    Then user is on Sepulsa main page
    And user choose the product
    And user fill the required data
    Then user can continue to pay the bill
    And user choose the paying method
    And user click pay button
    Then user successfully pay the product

  @PayingMethod @NormalNegative
  Scenario: User did not choose paying method
    Given user is on Sepulsa login page
    And user input correct username
    And user input correct password
    Then user is on Sepulsa main page
    And user choose the product
    And user fill the required data
    Then user can continue to pay the bill
    And user did not choose the paying method
    And user click pay button
    Then user cannot pay the product