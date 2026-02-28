package com.akshat1.com.akshat1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--Incognito");
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement k=driver.findElement(By.xpath("//select[@style='width: 30%; min-width: 300px; background-color: white; opacity: 0.75; padding-left: 20px; height: 40px; color: black;']"));
		Select s=new Select(k);
	s.selectByVisibleText("Canada");
		
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOf(k));

}}
