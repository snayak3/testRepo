package com.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class echoTrack_by_css_element {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/");
		WebElement uname = driver.findElement(By.cssSelector("input[placeholder*='Username']"));
		uname.sendKeys("samapti")	;
		
		WebElement password = driver.findElement(By.cssSelector("input[placeholder*='Password']"));
		password.sendKeys("samapti");
	    WebElement loginbtn = driver.findElement(By.name("Butsub"));
	    loginbtn.click();
	    
	    //driver.close();

	}

}
