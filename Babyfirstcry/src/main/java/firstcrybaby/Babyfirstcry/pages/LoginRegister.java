package firstcrybaby.Babyfirstcry.pages;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRegister {
	

	@FindBy(xpath = "/html/body/div[1]/div[5]/div/div[3]/ul/li[7]/span[1]")
	private WebElement register;
	
	@FindBy(id ="lemail")
	private WebElement emailbox;
	
	@FindBy(xpath ="//div[contains(@class, 'B14_white comm-btn btn-login-continue btn-login-cont-otp')]")
	private WebElement continuebtn;
	
	@FindBy(xpath = "//div[contains(@class, 'B14_white comm-btn btn-login-continue')]")
	private WebElement Submitbtn;
	
	@FindBy(xpath ="/html/body/div[1]/div[5]/div/div[3]/ul/li[9]/a/span[2]")
	private WebElement myShortlistbutton;
	

	public LoginRegister(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void clickRegister()
	{
		register.click();
	}
	public void EnterEmailID(String u) 
	{
		emailbox.sendKeys("bhoomishetty2327@gmail.com");
	}
	public void clickContinue() 
	{
		continuebtn.click();
	}
	
	public void clickSubmit() 
	{
		Submitbtn.click();
	}

	
	public  void clickMyShortlistbutton() {
		myShortlistbutton.click();
	}
		

}


