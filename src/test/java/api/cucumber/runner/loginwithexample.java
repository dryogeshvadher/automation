package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/features/userlogin.feature"},
        glue = {"api/cucumber/Stepdefination","api.cucumber.hooks"},
plugin ={"pretty", "junit:target/report.xml"},tags = "@smoketest")
public class loginwithexample {
}
