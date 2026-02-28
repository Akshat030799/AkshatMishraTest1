package com.akshat1.com.akshat1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class boostrpdropdwn {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
	/*driver.get("https://www.vuse.com/");
		WebElement k=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		String kname=k.getText();
		System.out.println(kname);
		WebElement l=driver.findElement(By.xpath("//select[@style='width: 30%; min-width: 300px; background-color: white; opacity: 0.75; padding-left: 20px; height: 40px; color: black;']"));
	String lol=l.getText();
	Select s=new Select(l);
	s.selectByVisibleText("Poland");*/
	
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	WebElement t=driver.findElement(By.xpath("//select"));
Select s1=new Select(t);
s1.selectByValue("AGO");
s1.selectByIndex(11);
s1.selectByVisibleText("India");




List<WebElement> doo= driver.findElements(By.xpath("//select/option"));
int y=doo.size();
System.out.println(y);

for(WebElement look:doo) {
	t.click();
	String o=look.getText();
	
	look.click();
//if (o.equals("Albania")) {
//		
//		break;}
		
		
	System.out.println(o);
}
	
	
	}
		 
	}
