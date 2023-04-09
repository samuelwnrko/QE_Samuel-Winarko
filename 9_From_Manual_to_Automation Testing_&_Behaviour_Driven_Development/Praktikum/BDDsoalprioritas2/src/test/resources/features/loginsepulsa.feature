Feature: Login Sepulsa

  @Login @NormalPositive
  Scenario: Login to Sepulsa
    Given user is on Sepulsa login page
    And user input correct username
    And user input correct password
    And user click login
    Then user can login and go to main page of Sepulsa

  @Login @NormalNegative
  Scenario: Login to Sepulsa with incorrect password
    Given user is on Sepulsa login page
    And user input correct username
    And user input incorrect password
    And user click login
    Then user cannot login and still on login page

  @Login @NormalNegative
  Scenario: Login to Sepulsa with incorrect username
    Given user is on Sepulsa login page
    And user input incorrect username
    And user input correct password
    And user click login
    Then user cannot login and still on login page

  @Login @NormalNegative
  Scenario: Login to Sepulsa with incorrect username and password
    Given user is on Sepulsa login page
    And user input incorrect username
    And user input incorrect password
    And user click login
    Then user cannot login and still on login page

  @Login @NormalNegative
  Scenario: Login to Sepulsa with blank username and password
    Given user is on Sepulsa login page
    And user input blank username
    And user input blank password
    And user click login
    Then user cannot login and still on login page
