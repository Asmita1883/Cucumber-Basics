package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/Registration.feature"},
        glue = {"stepdefinition", "hooks"},
        tags = "@Prod",
        dryRun = false,
        plugin = {"pretty"},publish = true)
public class TestRunner {

}
