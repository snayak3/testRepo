package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
	    driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("samapti");
	    driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("bal");
	    driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("samapti.bal@gmail.com");
	    driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9990198271");
	    driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Test1234312");
	    driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Test1234312");
	    driver.findElement(By.xpath("//label[@for='input-newsletter-yes']")).click();
	    driver.findElement(By.xpath("//label[@for='input-agree']")).click();
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	    driver.close();

	}

}
