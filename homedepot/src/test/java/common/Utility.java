package common;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Utility {
 public static WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  String local=System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", local+"\\src\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.homedepot.com/");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
