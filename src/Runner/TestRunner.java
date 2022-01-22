package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Feature/ValidRegistration.feature",glue= {"StepDefinition"},plugin= {"pretty","html:target/cucumber-repo"})
public class TestRunner {

}
