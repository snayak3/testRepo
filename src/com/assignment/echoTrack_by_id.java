package com.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class echoTrack_by_id {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/");
		WebElement uname = driver.findElement(By.id("txtCustomerID"));
		uname.sendKeys("samapti")	;
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("samapti");
	    WebElement loginbtn = driver.findElement(By.id("Butsub"));
	    loginbtn.click();
	    
	    //driver.close();

	}

}
