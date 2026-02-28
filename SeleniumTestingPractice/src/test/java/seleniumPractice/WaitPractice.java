package seleniumPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitPractice {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com/");
		/*WebElement CssText=driver.findElement(By.cssSelector("input.search-box-text"));
		Boolean isdisplayed=CssText.isDisplayed();
		Boolean isEnabled=CssText.isEnabled();
		Boolean isSelected=CssText.isSelected();
		
		System.out.println(isdisplayed);
		System.out.println(isEnabled);
		System.out.println(isSelected);*/

//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement CssText1=wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input.search-box-text"))));
//		System.out.println(CssText1.getText());
//		
		
		driver.navigate().to("https://www.google.com/");
	}

}
