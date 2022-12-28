package api.cucumber.Stepdefination;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;


public class MyStepDefinitions {

    @Given("^user is at the login page of the application$")
    public void user_is_at_the_login_page_of_the_application() throws Throwable {
        System.out.println("hi");
    }

    @When("^user logs in with following username and password$")
    public void user_logs_in_with_following_username_and_password(DataTable dataTable) throws Throwable {
        List<List<String>> listofrows = dataTable.asLists();
        for (List<String> row : listofrows) {
            for (String str : row) {
                System.out.println("data : " + str);
            }
        }
    }

    @Then("^user should be able to login with correct username and password$")
    public void user_should_be_able_to_login_with_correct_username_and_password() throws Throwable {
        System.out.println("hi");
    }

}