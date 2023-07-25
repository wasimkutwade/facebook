package facebookpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMfacebook {

	@FindBy(xpath="//input[@id='email']")private WebElement Username;
	@FindBy(xpath="//input[@id='pass']") private WebElement Password;
	@FindBy(xpath ="//button[@id='loginbutton']") private WebElement login;
	
	public POMfacebook (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Sendemail() 
	{
		Username.sendKeys("7558372685");
	}
	
	public void sendpass()
	{
		Password.sendKeys("09061994");
	}
	
	public void clickonlogon()
	{
		login.click();
	}
	
	

}
