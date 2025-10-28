Feature: Multi Login Feature

  In order to perform multi login to the application we can use scenario outline

  Scenario Outline: Login with multi set of users
    Given I navigate to example.com
    When  I am on the login page
    Then  I enter "<username>" username
    And   I enter "<password>" password
    And   I click on login button
    Then  I "<status>" successfully logged in
    Examples:
      | username | password    | status        |
      | valid    | valid       | should be     |
      | valid    | invalid     | should not be |
      | admin    | admin@123   | should be     |
      | manager  | manager@123 | should be     |
      | valid    |             | should not be |