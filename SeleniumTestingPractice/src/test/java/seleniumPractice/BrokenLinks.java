package seleniumPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-proxy-server", "--disable-dev-shm-usage", "--no-sandbox", "--disable-gpu",
				"--remote-allow-origins=*", "--user-data-dir=C:/temp/chrome-profile");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> brok=driver.findElements(By.tagName("a"));
		
		for(WebElement kin: brok) {
			
			 String app=kin.getAttribute("href");
		//	 System.out.println("First wala"+kin.getText());
			 if(app==null || app.isEmpty()) {
				 
				 
				 System.out.println("WRONG LINK");
				 continue;
			 }
			 try
			 {
				URL Link= new  URL(app);
				HttpURLConnection ccc= (HttpURLConnection) Link.openConnection();
				ccc.connect();
				 
				 
			if(ccc.getResponseCode()>=400) {
				System.out.println("2nd wala====Broken link"+app);
			}
			else {
				
				System.out.println("Nahi wala==No Broken Link"+app);
			}
			}
			catch(Exception e) {}
			
			
			
		}
driver.close();
	}

}
