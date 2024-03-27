package com.webdriver.demos;

	import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
	
	public class d02 {

		public static void main(String[] args) {
			WebDriver driver = new EdgeDriver();
			
			//open blank browser
			driver.manage().window().maximize();
			//maximize the browser
		driver.get("https://www.google.co.in/");

	driver.close();
	//close the browser.
		}

	}


