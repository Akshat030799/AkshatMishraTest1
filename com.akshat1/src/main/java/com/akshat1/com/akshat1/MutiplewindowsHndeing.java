package com.akshat1.com.akshat1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutiplewindowsHndeing {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--Incognito");
		
		WebDriver driver =new ChromeDriver(options);
		
		
		
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	String Parid=driver.getWindowHandle();
	System.out.println(Parid);
	Thread.sleep(6000);
	
	driver.findElement(By.xpath("//button[@id='newTabsBtn']")).click();
	
	
	Set<String> onebyoneids=driver.getWindowHandles();
	
	System.out.println(onebyoneids);
	
	int Ids=onebyoneids.size();System.out.println(Ids);
	
	
	for(String setid:onebyoneids) {
	String Title=driver.getTitle();
	System.out.println(Title);
	
	
	if(!setid.equals(Parid)) {
		driver.switchTo().window(setid);
		String Titles=driver.getTitle();
		System.out.println(Titles);
		
		if(Titles.contains("AlertsDemo")) {
		
			driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		//	break;
	}
		if(Titles.contains("Basic Controls")) {
			
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ajay");
			break;
		}
		
		
	}
	driver.switchTo().window(Parid);
	//driver.findElement(By.xpath("//button[@id='newTabsWindowsBtn']")).click();
	
	
	
	
	
}
	}

}
