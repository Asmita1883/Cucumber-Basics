package stepdefinition;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.SQLOutput;

public class LoginSteps {

@Given("I navigate to example.com")
public void i_navigate_to_example_com() {
    System.out.println("Step 1: Given I am navigating to example.com");
}

@When("I am on the login page")
public void i_am_on_the_login_page() {
    System.out.println("Step 2: When I am on the login page");

}

@And("I enter {string} username")
public void i_enter_valid_username(String username) {
    System.out.println("Step 3: When I enter "+username+" username");
}

@And("I enter {string} password")
public void i_enter_valid_password(String password) {
    System.out.println("Step 4: And I enter "+password+" password");
}

@And("I click on login button")
public void i_click_on_login_button() {
    System.out.println("Step 5: And I click on login button");
}

@Then("I {string} successfully logged in")
public void i_should_be_successfully_logged_in(String status) {
    System.out.println("Step 6: Then I "+status+" successfully logged in");

    System.out.println("***************************************");
}


}