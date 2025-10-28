Feature: Product Search Feature

  In order to search for a product, I need to navigate to the amazon.com

  Scenario: Search Product "Apple MacBook Pro"
    Given I am on the search field of amazon.com
    When I search for a product "Apple MAcBook Pro" with price 1000
    Then I should see "Apple MacBook Pro" is displayed

  Scenario: Search Product "Apple MacBook Air"
    Given I am on the search field of amazon.com
    When I search for a product "Apple MAcBook Air" with price 800
    Then I should see "Apple MacBook Air" is displayed

  Scenario: Search Product "Lenovo Thinkpad"
    Given I am on the search field of amazon.com
    When I search for a product "Lenovo Thinkpad" with price 700
    Then I should see "Lenovo Thinkpad" is displayed