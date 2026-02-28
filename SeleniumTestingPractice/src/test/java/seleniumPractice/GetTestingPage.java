package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTestingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//System.out.println(driver.getPageSource());
	System.out.println(driver.getTitle());	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getWindowHandle());
	WebElement CssText=driver.findElement(By.cssSelector("input.search-box-text"));
	Boolean isdisplayed=CssText.isDisplayed();
	Boolean isEnabled=CssText.isEnabled();
	Boolean isSelected=CssText.isSelected();
	
	System.out.println(isdisplayed);
	System.out.println(isEnabled);
	System.out.println(isSelected);
	
	CssText.sendKeys("akshat");
	Thread.sleep(1000);
	driver.close();
	}

}
