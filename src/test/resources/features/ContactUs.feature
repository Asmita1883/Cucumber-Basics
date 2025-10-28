Feature: Contact us feature

  This is to test passing the paragraph to the test area in the application

  Scenario: Contact us text area
    Given   I navigate to booking.com
    When    I click on Contact us link and enter the following details
    """
    Hello, My account is locked and I'm not able to reset my password.
    Please help me unlock my account so I can login.
    """
    Then    I should see "query submitted" message is displayed
