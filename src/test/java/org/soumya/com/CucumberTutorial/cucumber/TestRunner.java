package org.soumya.com.CucumberTutorial.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java",
glue= "src/test/java",
plugin = "html:target/selenium-reports"
)
public class TestRunner {

}
