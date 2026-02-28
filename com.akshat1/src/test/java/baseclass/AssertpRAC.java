package baseclass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertpRAC {
	
	@Test
	public void asssertion() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--Incognito");
		
	 WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
		String Exepres="Automation Panda";
		String actures=driver.findElement(By.xpath("//H1[@CLASS='site-title']")).getText();
		Assert.assertEquals(Exepres, actures, "Cool no worry");
		
	}
	

}
