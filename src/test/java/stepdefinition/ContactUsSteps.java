package stepdefinition;

import io.cucumber.java.en.*;

public class ContactUsSteps {

    @When("I click on Contact us link and enter the following details")
    public void i_click_on_contact_us_link_and_enter_the_following_details(String docString) {
        System.out.println("Step 2:");
        System.out.println(docString);
    }
    @Then("I should see {string} message is displayed")
    public void i_should_see_message_is_displayed(String status) {
        System.out.println(" Step 3: Then I see  "+status+" message is displayed");
    }

}
