package com.akshat1.com.akshat1;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firefoc {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--Incognito");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.vuse.com/");
		
		WebElement k=driver.findElement(By.xpath("//select[@style='width: 30%; min-width: 300px; background-color: white; opacity: 0.75; padding-left: 20px; height: 40px; color: black;']"));
		Select s=new Select(k);
	s.selectByVisibleText("Canada");
	Thread.sleep(6000);
	
	WebElement over=driver.findElement(By.xpath("//button[@class='bat-cta-style button-dark center ']"));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
	wait.until(ExpectedConditions.visibilityOf(over));
	over.click();
	
	JavascriptExecutor js=(JavascriptExecutor ) driver;
	js.executeScript("argument[0].click();", over);

	

	}

}


