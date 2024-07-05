package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Learninglogin.feature", glue= {"StepDefination"}, 
 monochrome = true,
 plugin = {"pretty", "html:target/cucumber-reports.report.html"}
 //plugin = {"pretty","junit:target/JUnitReports/report.vml"}
)

public class TestRunner {

}
