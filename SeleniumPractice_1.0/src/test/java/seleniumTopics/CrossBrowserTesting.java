package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
  WebDriver driver;	
  @Test
  @Parameters({"Browser"})
  public void Test(String browser) {
	  
	  if (browser.equalsIgnoreCase("Chrome")) 
	  {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://hugelearning.com/iframe-practice-page/");
	}
	  
	  else {
		
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\aa\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  //kjejk
		  driver.get("http://hugelearning.com/iframe-practice-page/");
	}
	  
  }
}
