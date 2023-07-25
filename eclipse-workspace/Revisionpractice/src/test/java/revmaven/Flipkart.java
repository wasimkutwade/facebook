package revmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void Flipkartpra() throws InterruptedException 
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  driver.close();
	
  }
}
