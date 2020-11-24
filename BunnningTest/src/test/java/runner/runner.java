package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/searchTest.feature",
				glue = "stepDefs",
				dryRun = false,
				monochrome = true,
				plugin = {"pretty","html:test-out.html"})
public class runner {

}
