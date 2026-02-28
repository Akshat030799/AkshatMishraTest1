package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

public class TagNamePractice {

	public static void main(String[] args) throws InterruptedException { 
		WebDriverManager.chromedriver().setup();
		int i=0;
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.linkText("Udemy Courses")).click();
    List<WebElement> abc=driver.findElements(By.partialLinkText("a"));
    System.out.println(abc);
	System.out.println(abc.size());
	for(WebElement k: abc) {
		System.out.println(k+"  -"+k.getText());
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobiles");
		//driver.findElement(By.cssSelector("img[title=\"Show products in category Electronics\"]")).click();
		driver.findElement(By.cssSelector("img.slider-img[src=\"https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.webp\"]")).click();
	}
    
    
    
    Thread.sleep(10000);
	driver.close();	}

}
