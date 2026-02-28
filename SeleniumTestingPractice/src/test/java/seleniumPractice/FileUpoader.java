package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpoader {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-proxy-server", "--disable-dev-shm-usage", "--no-sandbox", "--disable-gpu",
				"--remote-allow-origins=*", "--user-data-dir=C:/temp/chrome-profile");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
String File1= "C:\\Users\\pmmis\\Downloads\\JAVA-SDET\\single file uploader.png";
String File2= "C:\\Users\\pmmis\\Downloads\\JAVA-SDET\\MultipleFileUploader.png";

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		//driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("C:\\Users\\pmmis\\Downloads\\JAVA-SDET\\single file uploader.png");
		//driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(File1);
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(File1+ "\n" +File2);



	}

}
