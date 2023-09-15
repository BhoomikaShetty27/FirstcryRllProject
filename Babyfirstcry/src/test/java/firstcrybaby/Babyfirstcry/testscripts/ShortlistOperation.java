package firstcrybaby.Babyfirstcry.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import firstcrybaby.Babyfirstcry.pages.DeleteProducts;
import firstcrybaby.Babyfirstcry.pages.FewProductShortlist;
import firstcrybaby.Babyfirstcry.pages.LoginRegister;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShortlistOperation  {
	WebDriver driver;
	FewProductShortlist s; 
	LoginRegister login;
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/");
	}

	@When("I log in with valid credentials")
	public void i_log_in_with_valid_credentials() throws InterruptedException{
	 login = new LoginRegister(driver);
	    login.clickRegister();
	    login.EnterEmailID("bhoomishetty2327@gmail.com");
	    login.clickContinue();
	    Thread.sleep(25000);
	    login.clickSubmit();
	  }
	

	@When("I shortlist a few products")
	public void i_shortlist_a_few_products()  {
	 s = new FewProductShortlist(driver);
		s.Search("Girl fashion");
		s.Searchicon();
		s.Hoveroverproduct();
}
	
	
	@When("I click on the Shortlist button")
	public void i_click_on_the_shortlist_button() {
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		s.shortlistsymbol();
		login.clickMyShortlistbutton();

	}

	@Then("the selected products should be in my Shortlist")
	public void the_selected_products_should_be_in_my_shortlist() {	   
		DeleteProducts d = new DeleteProducts(driver);
		d.productdelete();
		driver.switchTo().alert().accept();
		
	}

}
