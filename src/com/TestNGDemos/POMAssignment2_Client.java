package com.TestNGDemos;

import org.testng.annotations.*;

import com.assignment.POMAssignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMAssignment2_Client {
  WebDriver driver;
  POMAssignment POM;
  @Test
  public void login() {
	  POM.insertUsername("student");
	  POM.insertPassword("Password123");
	  POM.clickLoginButton();
  }
  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  POM = new POMAssignment(driver);
	  
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
