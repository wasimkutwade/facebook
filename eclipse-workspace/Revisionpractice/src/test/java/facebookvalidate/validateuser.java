package facebookvalidate;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebookbase.Basefacebook;
import facebookpom.POMLogin;
import facebookpom.POMfacebook;
import facebookpom.POMhome;

import facebookutility.Utility;

public class validateuser extends  Basefacebook{
	
	POMLogin log;
	POMhome home;
	
	@BeforeClass
	public void openbrowser() throws InterruptedException
	{
		lauchbrowser();
		log= new POMLogin(driver);
		
		home= new POMhome(driver);
		Thread.sleep(1000);
	}
	@BeforeMethod
	public void loginfb() throws EncryptedDocumentException, IOException, InterruptedException
	{
		log.Sendemail(Utility.readdatafromexcel(0, 0));
		Thread.sleep(1000);
		
		log.sendpass(Utility.readdatafromexcel(0, 1));
		Thread.sleep(1000);
		
		log.clickonlogon();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		home.clickonimage();
		Thread.sleep(2000);
	}
	@Test
	public void TC_validateuser() throws InterruptedException
	{
		Thread.sleep(1500);
		String actual = home.getactualusername();
		String Expected = "M Sami Kutwade";
		Assert.assertEquals(actual, Expected, "Test case Fail");
		Reporter.log("Verified User", true);	
		
		
	}
	@AfterMethod
	public void logoutt() throws InterruptedException
	{
		
		home.clickonlogout();
		Thread.sleep(1000);	}
	@AfterClass
	public void Quitebrowse() throws InterruptedException
	{
		
		
		closebrowser();
		
		
		
	}
	
	
  
}
