package api.cucumber.Stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
    @Given("^User should be logged in and should be present on his wall$")
    public void user_should_be_logged_in_and_should_be_present_on_his_wall()  {
        System.out.println("User should be logged in and should be present on his wall");
        System.out.println("my name is yogesh");

    }

    @When("^I type message in the box$")
    public void i_type_message_in_the_box()  {
        System.out.println("I type message in the box");

    }

    @Then("^The message should get posted$")
    public void the_message_should_get_posted()  {
        System.out.println("The message should get posted");
    }
    @And("^I click on post button$")
    public void i_click_on_post_button()  {
        System.out.println("I click on post button");
    }
}
