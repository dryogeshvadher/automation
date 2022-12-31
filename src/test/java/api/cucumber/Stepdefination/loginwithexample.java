package api.cucumber.Stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class loginwithexample {
    public class MyStepDefinitions {
       private WebDriver driver;

        @Given("^username is on home page$")
        public void username_is_on_home_page()  {
            WebDriverManager.chromedriver().setup();
        }

        @When("^ use navigate to login page$")
        public void use_navigate_to_login_page()  {

        }

        @Then("^message displayed login successfully$")
        public void message_displayed_login_successfully()  {

        }

        @And("^use enters \"([^\"]*)\" and \"([^\"]*)\"$")
        public void use_enters_something_and_something(String username, String password, String strArg1, String strArg2){

        }

    }
}
