@LoginFakeStoreAPI
Feature: Login to Fake Store API

  @FakeStoreAPI @LoginFakeStoreAPI
  Scenario: User login with correct username and password
    Given User call an api "/auth/login" with method "POST" with payload below
      | username | password |
      | mor_2314 | 83r5^_   |
    Then User verify status code is 200
    Then User verify "token" is exist

  @FakeStoreAPI @LoginFakeStoreAPI
  Scenario: User login with incorrect username and password
    Given User call an api "/auth/login" with method "POST" with payload below
      | username | password      |
      | test     | test123 |
    Then User verify status code is 401
    Then User verify response body should contain "username or password is incorrect"