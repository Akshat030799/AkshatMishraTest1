package com.akshat1.com.akshat1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mish {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		
	
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	Actions a=new Actions(driver);
	WebElement k=driver.findElement(By.xpath("//a[@href='https://www.globalsqa.com/free-ebooks/']"));
	a.moveToElement(k);
	
	a.contextClick(k).build().perform();

}
}