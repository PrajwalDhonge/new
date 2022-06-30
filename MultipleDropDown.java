package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.spicejet.com/");
   driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])")).click();
   driver.findElement(By.xpath("//div[contains(text(),'Agra')]")).click();
   driver.findElement(By.xpath("//div[contains(text(),'AMD')]")).click();   
	}

}
