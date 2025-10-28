@Epic1001
Feature: Login Feature

  In order to login to the application, I need to enter valid username and password

  Background:
    Given I navigate to example.com
    When  I am on the login page

    @Sprint10 @US201
  Scenario: Test Valid Login Scenario
    Then  I enter "valid" username
    And   I enter "valid" password
    And   I click on login button
    Then  I "should be" successfully logged in

      @Sprint10 @US202
  Scenario: Test Invalid Login Scenario
    Then  I enter "invalid" username
    And   I enter "invalid" password
    And   I click on login button
    Then  I "should not be" successfully logged in

        @Sprint11 @US215
  Scenario: Test Invalid Login Scenario_2
    Then  I enter "valid" username
    And   I enter "invalid" password
    And   I click on login button
    Then  I "should not be" successfully logged in

          @Sprint11 @US220
  Scenario: Test with Admin Credentials Scenario
    Then  I enter "admin" username
    And   I enter "admin@123" password
    And   I click on login button
    Then  I "should be" successfully logged in



