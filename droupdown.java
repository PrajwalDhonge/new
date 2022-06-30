package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class droupdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
	        driver.get("https://www.spicejet.com/");
	        driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])")).click();
	        driver.findElement(By.xpath("//div[contains(text(),'Agra')]")).click();
	        driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).click();
	        driver.findElement(By.xpath("//div[contains(text(),'Mumbai')]")).click();
	        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'])[3]")).click();
	}

}
