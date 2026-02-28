package com.akshat1.com.akshat1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertJvaPopop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--Incognito");
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert a=driver.switchTo().alert();
		String z=a.getText();System.out.println(z);
		a.accept();
		
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert b=driver.switchTo().alert();
		String x=b.getText();System.out.println(x);
		b.accept();
		
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert c=driver.switchTo().alert();
		String y=b.getText();System.out.println(y);
		c.dismiss();
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert d=driver.switchTo().alert();
		String e=d.getText();
		System.out.println(e);
		d.sendKeys("Akshat");
		d.accept();
	
		
		
	}

}
