package com.practice.com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTER2 extends TESTER1 {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
}
