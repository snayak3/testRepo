package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatewbst {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.orangehrm.com");
    driver.findElement(By.xpath("/html/body/nav/div/div[2]/div[2]/ul/li[1]/a/button")).click();
    driver.close();
	}

}
