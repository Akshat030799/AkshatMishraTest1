package com.akshat1.com.akshat1;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement k=driver.findElement(By.xpath("//input[@type='text']"));
	//k.sendKeys("Headphones");
//k.sendKeys(Keys.ENTER);
WebElement o=driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
	Select s=new Select(o);
	Thread.sleep(100);
	s.selectByVisibleText("Orders");

	}
}