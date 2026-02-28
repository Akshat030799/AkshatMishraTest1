package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
		

//	 static Properties prop=new Properties();
//	 String Brow=prop.getProperty("Browser");
//	 System.out.println(Brow);


	

//	static {
//		
//		
//		
//		try {
//			FileInputStream file=new FileInputStream("C:\\Users\\pmmis\\eclipse-workspace\\com.akshat1\\data\\testdata.properties");
//		
//		prop.load(file);
//		
//		
//		
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	} 
//	
	public void click(WebElement ele) {
		ele.click();
		
	}
	
	public void SelectByVisibleText(WebElement ele, String ee) {
		
		Select s=new Select(ele);
		s.selectByVisibleText(ee);
	}
	
public void SelectByIndex(WebElement ele, int i) {
		
		Select s=new Select(ele);
		s.selectByIndex(i);
	}


public void SelectByValue(WebElement ele, String ee) {
	
	Select s=new Select(ele);
	s.selectByValue(ee);
}

public void Ewait(WebElement k ) {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOf(k));
}
	
public  void chromedriver(){
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--Incognito");
	
 driver =new ChromeDriver(options);
	driver.manage().window().maximize();
}
	public  void sendokeys(WebElement ele,String s) {
		ele.sendKeys(s);
		
	}
		
		
		

	public WebDriver Websodriver() {
		
		return driver;
		
	}

public void Url(String s) {
	
	driver.get(s);
}


}

	






