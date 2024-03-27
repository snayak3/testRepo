package com.TestNGDemos;

import org.testng.annotations.Test;

import com.assignment.ASS1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TASS1 {
	WebDriver driver;
	ASS1 p;
	
  @Test
  public void login() {
	  p.insertUsername("Admin");
	  p.insertPassword("admin123");
	  p.clickLoginButton();
	  p.showmessage();
	  p.clickPim();
	  p.clickAdd();
  }
  @AfterMethod
  public void logout() {
	  //p.logout();
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  p = new ASS1(driver);
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
