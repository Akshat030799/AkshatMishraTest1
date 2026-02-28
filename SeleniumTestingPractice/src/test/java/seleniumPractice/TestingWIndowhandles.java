package seleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingWIndowhandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-proxy-server", "--disable-dev-shm-usage", "--no-sandbox", "--disable-gpu",
				"--remote-allow-origins=*", "--user-data-dir=C:/temp/chrome-profile");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.get("https://testautomationpractice.blogspot.com/");

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
        List<String> list=new ArrayList(Sets);
       String Site1= list.get(0);
       String Site2=list.get(1);
       String Site3=list.get(2);
       String Site4=list.get(3);
       String Site5=list.get(4);
       
       driver.switchTo().window(Site5);
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
        
        
		

	}

}
