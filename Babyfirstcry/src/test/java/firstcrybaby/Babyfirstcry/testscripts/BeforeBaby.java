package firstcrybaby.Babyfirstcry.testscripts;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeBaby extends Tools {

	@Before
	public void setUp(Scenario scenario) {
		//driver.quit();
	}

	@After
	public void tearDown() {
		//driver.quit();
	}
}
