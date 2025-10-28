package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;

public class RegistrationSteps {

    @Given("I am on the registration page of the application")
    public void i_am_on_the_registration_page_of_the_application() {
        System.out.println("Step 1: Given I am on the registration page of the application ");
    }

    @When("I enter values into the text field and click on submit")
    public void i_enter_values_into_the_text_field_and_click_on_submit(DataTable dataTable) {
        List<List<String>> Registration = dataTable.asLists();
        System.out.println(Registration);
    }

    @Then("I should see success message")
    public void i_should_see_success_message() {
        System.out.println("Step 3: Then I should see success message");
    }

}
