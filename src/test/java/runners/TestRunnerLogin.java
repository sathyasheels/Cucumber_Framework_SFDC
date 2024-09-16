package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\features\\Login.feature",
					glue= "stepdefinitions",
					monochrome=true,
					plugin= {"pretty","html:target/cucumber-reports/cucumber.html","json:target/cucmber-reports/cucumber.json"})

public class TestRunnerLogin {
	

}
