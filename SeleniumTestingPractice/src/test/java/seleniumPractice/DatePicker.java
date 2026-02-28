package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-proxy-server", "--disable-dev-shm-usage", "--no-sandbox", "--disable-gpu",
				"--remote-allow-origins=*", "--user-data-dir=C:/temp/chrome-profile");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input#datepicker")).click();
		
	Aftermonth(driver,"June","2029","3");
	}
		
		
				
		static void Beforemonth(WebDriver driver,String Month, String Year, String date) {
				while(true) {
			
			//WebElement defmonth=driver.findElement(By.xpath("//span[text()='December']"));
		//	WebElement defYear =driver.findElement(By.xpath("//span[text()='2025']"));
			String defmonth1=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[1]")).getText();
			String defYear1 =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[2]")).getText();
			System.out.println(defmonth1);
			System.out.println(defYear1);
			
			if(Year.equals(defYear1)&&Month.equals(defmonth1)){
				
				
				break;
			}
			else {
				
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			
			
			}
		List<WebElement> too= driver.findElements(By.xpath("//tbody//a"));
		
		for(WebElement cat : too) {
		String poi=cat.getText();
		System.out.println(poi);
		if(poi.equals(date)) {
			cat.click();
			break;
			}
		


	}

	}
		

		static void Aftermonth(WebDriver driver,String Month, String Year, String date) {
			while(true) {
		
		//WebElement defmonth=driver.findElement(By.xpath("//span[text()='December']"));
	//	WebElement defYear =driver.findElement(By.xpath("//span[text()='2025']"));
		String defmonth1=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[1]")).getText();
		String defYear1 =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[2]")).getText();
		System.out.println(defmonth1);
		System.out.println(defYear1);
		
		if(Year.equals(defYear1)&&Month.equals(defmonth1)){
			
			
			break;
		}
		else {
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		
		
		}
	List<WebElement> too= driver.findElements(By.xpath("//tbody//a"));
	
	for(WebElement cat : too) {
	String poi=cat.getText();
	System.out.println(poi);
	if(poi.equals(date)) {
		cat.click();
		break;
		}
}}}
