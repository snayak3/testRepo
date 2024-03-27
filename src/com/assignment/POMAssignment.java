package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class POMAssignment {
    WebDriver driver;
	public POMAssignment(WebDriver driver) {
		this.driver = driver;
		
		}
	public void insertUsername(String UN) {
		driver.findElement(By.id("username")).sendKeys(UN);
		
	   
		}
	public void insertPassword(String ps) {
		driver.findElement(By.id("password")).sendKeys(ps);
			
		   
		}
		
	public void clickLoginButton() {
		driver.findElement(By.id("submit")).click();
			
		   
		}

	

}
