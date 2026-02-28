package com.akshat1.com.akshat1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Aku {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--Incognito");
		
	 WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
		String Exepres="Automation Panda";
		String actures=driver.findElement(By.xpath("//H1[@CLASS='site-title']")).getText();
		org.junit.Assert.assertEquals(Exepres, actures, "Cool no worry");
		
		
		
	}

}
