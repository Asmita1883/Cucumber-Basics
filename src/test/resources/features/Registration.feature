Feature: User Registration

  We are trying to implement data table

  @List
    Scenario: User Registration as List
    Given   I am on the registration page of the application
    When    I enter values into the text field and click on submit
      | Asmita | Patel   | asmita@gmail.com | Test@123 | Test@123 |
      | Radha  | Krishna | Radha@gmail.com  | Pass@123 | Pass@123 |
      | Shiv   | Shakti  | Shiv@gmail.com   | Shiv@123 | Shiv@123 |
      | Sita   | Ram     | Sita@gmail.com   | Ram@123  | Ram@123  |

    Then    I should see success message

@Map
  Scenario: User Registration as Map
  Given   I am on the registration page of the application
  When    I enter 
