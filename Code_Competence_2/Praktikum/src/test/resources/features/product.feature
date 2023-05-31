@ProductsFakeStoreAPI
Feature: Product for Fake Store API

  @FakeStoreAPI @ProductsFakeStoreAPI
  Scenario: User can get all products
    Given User call an api "/products" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "products.json"

  @FakeStoreAPI @ProductsFakeStoreAPI
  Scenario: User can get product by ID
    Given User call an api "/products/1" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "byIdProducts.json"

  @FakeStoreAPI @ProductsFakeStoreAPI
  Scenario: User can get all products with limit
    Given User call an api "/products?limit=6" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "products.json"

  @FakeStoreAPI @ProductsFakeStoreAPI
  Scenario: User can get all products with descending sort
    Given User call an api "/products?sort=desc" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "products.json"

  @FakeStoreAPI @ProductsFakeStoreAPI
  Scenario: User can get products categories
    Given User call an api "/products/categories" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "productsCategories.json"

  @FakeStoreAPI @ProductsFakeStoreAPI
  Scenario: User can get specific products category
    Given User call an api "/products/category/jewelery" with method "GET"
    Then User verify status code is 200
    Then User verify response is match with json schema "products.json"

  @FakeStoreAPI @ProductsFakeStoreAPI
  Scenario: User can add new product
    Given User call an api "/products" with method "POST" with payload below
      | title            | price    | description    | image                   | category      |
      | Test Product     | 200000   | Product Test   | https://test.product    | jewelery      |
    Then User verify status code is 200
    Then User verify response is match with json schema "newProducts.json"

  @FakeStoreAPI @ProductsFakeStoreAPI
  Scenario: User can edit product data by ID
    Given User call an api "/products/7" with method "PUT" with payload below
      | title           | price    | description    | image                  | category      |
      | Test Product2   | 300000   | Product Test   | https://test.product   | jewelery      |
    Then User verify status code is 200
    Then User verify response is match with json schema "newProducts.json"

  @FakeStoreAPI @ProductsFakeStoreAPI
  Scenario: User can delete product by ID
    Given User call an api "/products/9" with method "DELETE"
    Then User verify status code is 200
    Then User verify response is match with json schema "byIdProducts.json"