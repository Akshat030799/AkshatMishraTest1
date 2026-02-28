package com.ApiAutomation.com.ApiAutomation;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAutomation {

	@Test
	public  void VerifyTitle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=1652196301589481744&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062097&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		
	}

}
