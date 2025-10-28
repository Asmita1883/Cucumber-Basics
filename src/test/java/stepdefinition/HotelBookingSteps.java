package stepdefinition;

import io.cucumber.java.en.*;

public class HotelBookingSteps {

    @Given("I navigate to booking.com")
    public void i_navigate_to_booking_com() {
        System.out.println("Step 1: Given I navigate to booking.com");
    }
    @When("I select room type as {string}")
    public void i_select_room_type_as(String roomType) {
        System.out.println("Step 2: when I select room type as " +roomType);

    }
    @When("I select the check-in date as {string} and check-out date as {string}")
    public void i_select_the_check_in_date_as_and_check_out_date_as(String checkIn, String checkOut) {
        System.out.println("Step 3: And I select the check-in date as " + checkIn+ " and check-out date as " + checkOut);
    }
    @When("I select number of guests as {int}")
    public void i_select_number_of_guests_as(Integer NoofGuests) {
        System.out.println("Step 4: And I select number of guests as " + NoofGuests);

    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("step 5: And I click on submit button");

    }
    @Then("I should see the {string} message with {int} as booking ID")
    public void i_should_see_the_message_with_as_booking_id(String bookingStatus, Integer bookingId) {
        System.out.println("Step 6: Then I should see the " + bookingStatus + " message with " + bookingId + " as +booking ID");
        System.out.println("");
    }
}
