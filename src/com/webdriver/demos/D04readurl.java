package com.webdriver.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D04readurl {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		String url = driver.getCurrentUrl();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println("URL:" + url);
		driver.close();

	}

}
