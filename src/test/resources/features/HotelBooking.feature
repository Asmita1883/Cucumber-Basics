Feature: Hotel Booking Feature

  In order to book a room, I need to be a registered user on the website

  @Epic1002 @Prod
  Scenario: Booking "Standard" room type
    Given  I navigate to booking.com
    When   I select room type as "standard"
    And    I select the check-in date as "10-20-2025" and check-out date as "10-25-2025"
    And    I select number of guests as 4
    And    I click on submit button
    Then   I should see the "booking confirmed" message with 1201 as booking ID

  Scenario: Booking "Deluxe" room type
    Given  I navigate to booking.com
    When   I select room type as "Deluxe"
    And    I select the check-in date as "11-16-2025" and check-out date as "11-20-2025"
    And    I select number of guests as 2
    And    I click on submit button
    Then   I should see the "booking confirmed" message with 1205 as booking ID

  Scenario: Booking "Suite" room type
    Given  I navigate to booking.com
    When   I select room type as "Suite"
    And    I select the check-in date as "12-23-2025" and check-out date as "12-31-2025"
    And    I select number of guests as 8
    And    I click on submit button
    Then   I should see the "booking confirmed" message with 1206 as booking ID
