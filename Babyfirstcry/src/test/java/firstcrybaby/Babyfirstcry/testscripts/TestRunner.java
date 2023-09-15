package firstcrybaby.Babyfirstcry.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;



import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = "Features",
		glue = "firstcrybaby.Babyfirstcry.testscripts"
		//dryRun = true
		//tags="Shortlist products in an application"
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
