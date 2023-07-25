package facebookpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class POMhome {
	
	@FindBy(xpath = "//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'][1]" )private WebElement Image;
	@FindBy(xpath = "//span[text()='M Sami Kutwade'][1]")private WebElement Profile;
	@FindBy(xpath = "//span[text()='Log out']") private WebElement logout;
	
	public POMhome(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickonimage()
	{
		Reporter.log("Click on image", true);
		Image.click();
	}
	public String getactualusername()
	{
		Reporter.log("Getting Actual user name", true);
		
	String actualuser = Profile.getText();
		return actualuser;
			
	}
	public void clickonlogout()
	{
		Reporter.log("Click on logout Button", true);
		logout.click();
	}
	

}
