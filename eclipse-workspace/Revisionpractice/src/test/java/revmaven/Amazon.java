package revmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void Amazontest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  driver.close();
	  
  }
}
