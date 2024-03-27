package com.webdriver.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class d03readtitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		String actTitle = driver.getTitle();
		System.out.println("Title is:" + actTitle);
	

	if(actTitle.contains("Mee"))
		
	System.out.println("Title matching!!! Test case is pass");
		
	else
		System.out.println("Title not matching!!! Test case is fail");
	driver.close();
	
			// TODO Auto-generated method stub

		}
			// TODO Auto-generated method stub


		
			// TODO Auto-generated method stub

		

	}


