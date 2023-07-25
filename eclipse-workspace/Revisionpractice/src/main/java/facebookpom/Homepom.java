package facebookpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepom {
	
	@FindBy(xpath = "//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'][1]" )private WebElement Image;
	@FindBy(xpath = "//span[text()='M Sami Kutwade'][1]")private WebElement Profile;
	@FindBy(xpath = "//span[text()='Log out']") private WebElement logout;
	
	public   Homepom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickonimage()
	{
		Image.click();
	}
	public void getactualusername()
	{
		
	String actualuser = Profile.getText();
	String expected = "M Sami Kutwade";
	if (actualuser.equals(expected)) 
	{
		System.out.println("validate user");
		
	}
	else 
	{
		System.out.println("Invalid user");
		
	}
		
			
	}
	public void clickonlogit()
	{
		logout.click();
	}
	

}
