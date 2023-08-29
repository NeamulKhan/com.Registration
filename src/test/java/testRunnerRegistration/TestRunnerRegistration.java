package testRunnerRegistration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utilityRegistration.BaseClass_Registration;

@CucumberOptions(features = {"src/test/resources/featureFolderRegistration"},
plugin = {"json:target/cucumber.json"},
glue ="stepDefinationRegistration", tags= {"@Registration1"}
)

public class TestRunnerRegistration extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	
	public void regissetup()throws Exception {
		
		BaseClass_Registration test = new BaseClass_Registration();
		
		test.regisbrowserinit();
	}
	
	@AfterTest
	
	public void regisClosureURL() throws Exception {
		
		BaseClass_Registration test = new BaseClass_Registration();
		
		//test.driver.quit();
		
	}
	
}


	


