package facebookpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class POMLogin {
	

	@FindBy(xpath="//input[@id='email']")private WebElement Username;
	@FindBy(xpath="//input[@id='pass']") private WebElement Password;
	@FindBy(xpath ="//button[@id='loginbutton']") private WebElement login;
	
	public POMLogin (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Sendemail(String email) 
	{
		Reporter.log("Send user name as email", true);
		Username.sendKeys(email);
	}
	
	public void sendpass(String Pass)
	{
		Reporter.log("Send password as mob no", true);
		Password.sendKeys(Pass);
	}
	
	public void clickonlogon()
	{
		Reporter.log("Click login button", true);
		login.click();
	}
	
	

}
