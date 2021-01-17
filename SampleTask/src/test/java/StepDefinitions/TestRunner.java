package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"},
monochrome=true,
plugin={"pretty","json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml",
		"html:target/HTMLReports"},
tags="@smoketest"
)


public class TestRunner {
	

}
