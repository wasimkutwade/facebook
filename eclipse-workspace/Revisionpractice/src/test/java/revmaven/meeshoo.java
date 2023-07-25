package revmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class meeshoo {
  @Test
  public void Meshoo() throws InterruptedException {
	  
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.meeshoo.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
  }
}
