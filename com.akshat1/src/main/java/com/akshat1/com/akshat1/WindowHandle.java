package com.akshat1.com.akshat1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	public static void main(String[] args) {

	WebDriverManager.edgedriver().setup();
	
	
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
driver.manage().window().maximize();
String parid=driver.getWindowHandle();
//System.out.println(parid);

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();

Set<String> totalIds =driver.getWindowHandles();

for(String allIds:totalIds) {
	String k=driver.getTitle();
	System.out.println(k);
	
	if(!allIds.equals(parid)) {

		driver.switchTo().window(allIds);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("koi");
	driver.close();
	}
	
}








}
}