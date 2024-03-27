package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class NgArry {
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",actUrl;
  @Test(dataProvider = "getlogindata")
  
  public void loginToOHRM(String un, String ps) {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      actUrl = driver.getCurrentUrl();
      Assert.assertEquals(actUrl, expUrl);
  }
 
  @DataProvider
  public Object[][] getlogindata() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "samapti", "samapti123" },
      new Object[] { "satya", "satya123" },
    };
  }

  @AfterMethod
  public void afterMethod() {
	  if(actUrl.equals(expUrl) ) {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]")).click();
	  driver.findElement(By.partialLinkText("Log")).click();
	  }
	  else
	  {
		  System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
	  }
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
@AfterTest
public void afterTest(){
	driver.close();
}

}



