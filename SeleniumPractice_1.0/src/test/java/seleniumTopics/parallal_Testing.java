package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallal_Testing {
	
	WebDriver driver;
	
  @Test
  public void TestCase_1() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://freecrm.com/");
	  System.out.println(Thread.currentThread().getId());
  }
  
  @Test
  public void TestCase_2() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://freecrm.com/");
	  System.out.println(Thread.currentThread().getId());
  }
}
