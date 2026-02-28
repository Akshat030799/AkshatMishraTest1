package seleniumPractice;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrxtTesting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();

		File file=new File("C:\\Automation\\automationFiles\\crx files\\uBlock-Origin.crx");
		options.addExtensions(file);

		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		

	}

}
