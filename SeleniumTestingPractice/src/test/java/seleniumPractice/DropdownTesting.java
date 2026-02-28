package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting {

	public static void main(String[] args) throws InterruptedException {
		// 
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-proxy-server", "--disable-dev-shm-usage", "--no-sandbox", "--disable-gpu",
				"--remote-allow-origins=*", "--user-data-dir=C:/temp/chrome-profile");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		List<WebElement>List=driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item' and @href='#']"));
		
		for(WebElement abc: List) {
			String aks=abc.getText();
			System.out.println(aks);
			
			if(aks.equalsIgnoreCase("Something else here")) {
				Thread.sleep(10000);
				abc.click();
				Thread.sleep(10000);
			}
		}
		

	}

}
