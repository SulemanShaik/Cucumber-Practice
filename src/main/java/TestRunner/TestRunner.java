package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        //features="Features",
		        //features="F:/Selenium Practice - SEPTEMBER/CucumberPractice/Features/Tagging.feature",
		        features="F:\\Selenium Practice - SEPTEMBER\\CucumberPractice\\Features\\MyLogin.feature",
		        glue="StepDefinitions",
		        dryRun=false,
		        plugin= {"pretty"},
		        monochrome=true
		        //strict=false
		        )
public class TestRunner {

}
