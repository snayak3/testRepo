package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ASS1 {
	 WebDriver driver;
		public ASS1(WebDriver driver) {
			this.driver = driver;
			
			}
		public void insertUsername(String UN) {
			driver.findElement(By.name("username")).sendKeys(UN);  
			
		   
			}
		public void insertPassword(String ps) {
			driver.findElement(By.name("password")).sendKeys(ps);
				
			   
			}
			
		public void clickLoginButton() {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
				
			   
			}
		public void clickPim () {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		}
		public void clickAdd (){
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		}

		public void showmessage() {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText());

	}

}	 