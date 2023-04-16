Feature: Login saucedemo.com

  @Login @NormalPositive
  Scenario: Login to saucedemo
    Given user is on saucedemo login page
    And user input accepted username
    And user input password for all user
    And user click login
    Then user can login and go to main page

  @Login @NormalNegative
  Scenario: Login to saucedemo with incorrect password
    Given user is on saucedemo login page
    And user input accepted username
    And user input incorrect password
    And user click login
    Then user cannot login and still on login page

  @Login @NormalNegative
  Scenario: Login to saucedemo with unaccepted username
    Given user is on Sepulsa login page
    And user input unaccepted username
    And user input password for all user
    And user click login
    Then user cannot login and still on login page

  @Login @NormalNegative
  Scenario: Login to saucedemo with unaccepted username and password
    Given user is on saucedemo login page
    And user input unaccepted username
    And user input incorrect password
    And user click login
    Then user cannot login and still on login page
