package revmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prac {
  @Test
  public void Facebook() throws InterruptedException
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
}
