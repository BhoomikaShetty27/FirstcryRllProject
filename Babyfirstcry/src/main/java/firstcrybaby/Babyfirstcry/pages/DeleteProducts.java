package firstcrybaby.Babyfirstcry.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProducts {
	private Actions actions;

	@FindBy(xpath ="//*[@id=\"DivContent\"]/div[1]/div/div/div[5]/div[3]/span")
	private WebElement deleteproduct;
	
	
	public DeleteProducts(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	actions = new Actions(driver);
	}
	
	public void productdelete()
	{
		deleteproduct.click();
		
	}

}
