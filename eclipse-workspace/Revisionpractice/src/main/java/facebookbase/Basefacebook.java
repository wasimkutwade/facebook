package facebookbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Basefacebook {
	
	static protected  WebDriver driver;
	public void lauchbrowser() throws InterruptedException
	{
		
		//ChromeOptions opt =new ChromeOptions();
		//opt.addArguments("--disable notifications");
		
		 driver = new ChromeDriver();
		 Reporter.log("Lauch browser", true);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1500);	
		
	}
	public void closebrowser() throws InterruptedException
	{
		Reporter.log("Closing Browser", true);
		driver.quit();
		Thread.sleep(1000);
	}

}
