package com.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class echoTrack_by_class {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/");
		WebElement uname = driver.findElement(By.className("form-control"));
		uname.sendKeys("samapti")	;
		
		WebElement password = driver.findElement(By.className("form-control"));
		password.sendKeys("samapti");
	    WebElement loginbtn = driver.findElement(By.className("btn btn-lg btn-block btn-primary"));
	    loginbtn.click();
	    
	    //driver.close();

	}

}
