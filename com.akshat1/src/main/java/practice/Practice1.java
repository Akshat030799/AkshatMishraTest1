package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import cucumber.api.cli.Main;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
WebDriver driver;

public void info() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--Incognito");
	
	WebDriver driver =new ChromeDriver(options);
	driver.get("https://www.vuse.com/");
	driver.manage().window().maximize();
	
}

	
	
	
	

public void ckc(WebElement k) {
	k.click();
	
	
}


public void watings(WebElement k) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(k));
	
	
}
}
