package com.webdriver.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01launchinggooglechrome {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//open blank browser
		driver.manage().window().maximize();
		//maximize the browser
	driver.get("https://www.google.co.in/");

driver.close();
//close the browser.
	}

}
