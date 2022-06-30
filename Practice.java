package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Refrigerator");
        driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
        driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[9]")).click();
      
	}

}
