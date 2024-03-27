package com.assignment;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {

		
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://webflow.com/");
    TakesScreenshot scrShot = ((TakesScreenshot)driver);
    File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
    File DestFile = new File("D://test.png");
    FileUtils.copyFile(scrFile, DestFile);
    driver.close();
	}

}
