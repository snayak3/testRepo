package com.assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://webflow.com/");
    driver.findElement(By.xpath("//*[@id=\"w-dropdown-toggle-1\"]/div[1]")).click();
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/nav/div/ul/li[2]/div/nav/div/div[1]/div[1]/ul/li/ul/li[2]/a")).click();
    
    driver.close();
	}

}
