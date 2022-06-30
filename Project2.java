package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
	        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Refrigerator");
	        driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	        driver.findElement(By.xpath("//span[contains(text(),'Samsung 192 L 2')]")).click();
	       
	        WebElement price1=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
	        String before=price1.getText();
	        System.out.println("Before"+" "+before);
	        WebElement price2=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
	        String after=price2.getText();
	        System.out.println("After"+" "+after);
	        if(after.equals(before))
	        {
	        	System.out.println("Same Price");
	        }
	        else
	        {
	        	System.out.println("Not Same Price");
	        }
		}
	}

