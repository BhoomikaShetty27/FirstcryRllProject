package firstcrybaby.Babyfirstcry.testscripts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import firstcrybaby.Babyfirstcry.pages.Clickshortlist;
import firstcrybaby.Babyfirstcry.pages.DeleteProducts;
import firstcrybaby.Babyfirstcry.pages.FewProductShortlist;
import firstcrybaby.Babyfirstcry.pages.LoginRegister;


public class Driver {

	protected static WebDriver driver;
	protected static Clickshortlist clickshortlist;
	protected static FewProductShortlist fewProductShortlist ; 
	protected static LoginRegister loginRegister ;
	protected static DeleteProducts deleteproducts ;
	

	public static void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://firstcry.com/");
		clickshortlist =new Clickshortlist(driver);
		fewProductShortlist=new FewProductShortlist(driver);
		loginRegister =new LoginRegister(driver);
		deleteproducts=new DeleteProducts(driver);
		

	}
}
