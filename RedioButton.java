package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.goibibo.com/");
		   driver.findElement(By.xpath("//span[contains(text(),'Round-trip')]")).click();
		   //driver.findElement(By.xpath("//div[@class='sc-himrzO bZxKPD']")).click();
		  // driver.findElement(By.xpath("//input[@value]")).sendKeys("Nagpur");
		  // driver.findElement(By.xpath("//span[contains(text(),'Nagpur')]")).sendKeys(Keys.ENTER);
		   driver.findElement(By.xpath("//div[@class='sc-himrzO jyKOEg']")).click();
		   
		  
	}

}
