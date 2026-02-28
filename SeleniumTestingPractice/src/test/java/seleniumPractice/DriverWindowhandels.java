package seleniumPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverWindowhandels {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-proxy-server", "--disable-dev-shm-usage", "--no-sandbox", "--disable-gpu",
				"--remote-allow-origins=*", "--user-data-dir=C:/temp/chrome-profile");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.get("https://testautomationpractice.blogspot.com/");

		
		WebElement ele = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		ele.sendKeys("Selenium");
		WebElement Search = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		Search.click();
		driver.findElement(By.xpath(("//a[text()='Selenium']"))).click();
		driver.findElement(By.xpath(("//a[text()='Selenium in biology']"))).click();
		driver.findElement(By.xpath(("//a[text()='Selenium (software)']"))).click();
		driver.findElement(By.xpath(("//a[text()='Selenium disulfide']"))).click();
		driver.findElement(By.xpath(("//a[text()='Selenium dioxide']"))).click();
        Set<String> Sets=driver.getWindowHandles();
        System.out.println(Sets);
        
        for(String abc: Sets) {
        	
        	
        	String abcd=driver.switchTo().window(abc).getTitle();
        	
        	if(abcd.contains("Selenium (software) - Wikipedia")) {
        		
        		driver.findElement(By.xpath("//img[@class='mw-file-element'][@width='180']")).click();
        		System.out.println(driver.getCurrentUrl());
        		System.out.println(driver.getTitle());
        		break;
        	}
        		
        	
        }

		
		//driver.close();

	}

}
