package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.booking.com/");
        driver.findElement(By.xpath("//input[@id='ss']")).click();
        driver.findElement(By.xpath("//input[@id='ss']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Goa')]")).click();
        driver.findElement(By.xpath("//td[@class='bui-calendar__date bui-calendar__date--today']")).click(); 
        driver.findElement(By.xpath("//td[@data-date='2022-07-07']")).click();
        driver.findElement(By.xpath("//div[@class='xp__input-group xp__guests']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Increase number of Adults']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Increase number of Children']")).click();
        Select s=new Select(driver.findElement(By.xpath("//select[@name='age']")));
        //s.selectByValue("3");
        //s.selectByIndex(5);
        s.selectByVisibleText("5 years old");
        driver.findElement(By.xpath("//button[@aria-label='Increase number of Rooms']")).click();
        driver.findElement(By.xpath("//div[@data-component='search/travel-purpose/checkbox']")).click();
        driver.findElement(By.xpath("//button[@data-sb-id='main']")).click();
	}

}