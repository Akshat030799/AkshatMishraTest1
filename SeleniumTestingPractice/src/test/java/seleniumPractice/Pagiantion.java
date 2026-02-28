package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagiantion {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-proxy-server", "--disable-dev-shm-usage", "--no-sandbox", "--disable-gpu",
				"--remote-allow-origins=*", "--user-data-dir=C:/temp/chrome-profile");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		
		driver.get("https://testautomationpractice.blogspot.com/");
		/*List<WebElement> Sto=driver.findElements(By.xpath("//ul[@class='pagination']//li"));

for(WebElement l: Sto) {
	
Thread.sleep(5000);	
l.click();
List<WebElement> Take=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
List<WebElement> Takee=driver.findElements(By.xpath("//td//input[@type='checkbox']"));
for(WebElement po :Takee) {po.click();}
	for(WebElement put: Take) {
		
	System.out.println(put.getText());
	
	}
	*/

WebElement Text=driver.findElement(By.xpath("//p[text()='Memory Size of Firefox process: ']"));
String u=Text.getText();System.out.println(u);
String t=u.substring(u.indexOf("F"),u.indexOf(" proc" ));
System.out.println(t);
driver.close();

	}}




