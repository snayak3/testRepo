package com.webdriver.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DOXTRACKPATH {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("satyaranjan.nayak.@gmail.com");
		driver.findElement(By.xpath("//form[@class=\"_9vtf\"]/div/div/input")).sendKeys("bal");
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();

	}

}
