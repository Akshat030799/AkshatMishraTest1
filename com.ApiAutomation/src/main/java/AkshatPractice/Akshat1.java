package AkshatPractice;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Akshat1 { 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login?ReturnUrl=%2fcustomer%2finfo");
		
		WebElement Register=driver.findElement(By.xpath("//a[@class='ico-register']"));
		Register.click();
		
		WebElement Gender=driver.findElement(By.xpath("(//input[@name='Gender'])[1]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(Gender));
		Gender.click();
		
		WebElement Firstname= driver.findElement(By.xpath("(//input[@class='text-box single-line'])[1]"));
		Firstname.sendKeys("Sayali");
		
		WebElement Lastname= driver.findElement(By.xpath("(//input[@class='text-box single-line'])[2]"));
		Lastname.sendKeys("Khelpande");
		
		WebElement Email= driver.findElement(By.xpath("(//input[@class='text-box single-line'])[2]"));
		Email.sendKeys("Khelpande1255225@gmail.com");
		
		WebElement Password= driver.findElement(By.xpath("(//input[@class='text-box single-line password'])[1]"));
		Password.sendKeys("Sayali@1253");
		
		WebElement  ConfirmPassword= driver.findElement(By.xpath("(//input[@class='text-box single-line password'])[2]"));
		ConfirmPassword.sendKeys("Sayali@1253");
		
		WebElement  Registerbutton= driver.findElement(By.xpath("//input[@id='register-button']"));
		Registerbutton.click();
		
		WebElement  Continue= driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"));
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(Continue));
	    Continue.click();
	    
	    WebElement  Order= driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
	    WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(Order));
	    Order.click();
	    
	    WebElement  Shopping= driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
		WebDriverWait wait22=new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(Shopping));
	    Shopping.click();
	    
	    WebElement  Agree= driver.findElement(By.xpath("//input[@id='termsofservice']"));
			WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.visibilityOf(Agree));
		    Agree.click();
		    
		    WebElement  checkout= driver.findElement(By.xpath("//button[@id='checkout']"));
		    checkout.click();
	    
		    WebElement  Company= driver.findElement(By.xpath("(//input[@class='text-box single-line'])[4]"));
			WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.visibilityOf(Company));
		    Company.sendKeys("TechFlitter");
		
		    WebElement  Country= driver.findElement(By.xpath("(//select)[1]"));
		    Select s1= new Select(Country);
		    s1.selectByVisibleText("India");
		   
		    WebElement  City= driver.findElement(By.xpath("(//input[@class='text-box single-line'])[4]"));
		    City.sendKeys("Pune");
		    
		    WebElement  Address1= driver.findElement(By.xpath("(//input[@class='text-box single-line'])[5]"));
		    Address1.sendKeys("Karve Nagar Pune");
		
		    WebElement  Zip= driver.findElement(By.xpath("//input[@data-val-required='Zip / postal code is required']"));
		    Zip.sendKeys("698225");
		
		    WebElement  Phone_No= driver.findElement(By.xpath("//input[@data-val-required='Phone is required']"));
		    Phone_No.sendKeys("9587441226");
		    
		    WebElement  Con= driver.findElement(By.xpath("(//input[@title='Continue'])[1]"));
		    Con.click();
		    
		    WebElement  Click1= driver.findElement(By.xpath("(//input[@type='button'])[3]"));
		    WebDriverWait wait7=new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.visibilityOf(Click1));
		    Click1.click();
		    
		    WebElement  Click2= driver.findElement(By.xpath("(//input[@type='button'])[4]"));
		    WebDriverWait wait8=new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.visibilityOf(Click2));
		    Click2.click();
        
		    WebElement  Click3= driver.findElement(By.xpath("(//input[@type='button'])[5]"));
		    WebDriverWait wait88=new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.visibilityOf(Click3));
		    Click3.click();
		    
		    WebElement  Click4= driver.findElement(By.xpath("(//input[@type='button'])[6]"));
		    WebDriverWait wait98=new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.visibilityOf(Click4));
		    Click4.click();

		    WebElement  Click5= driver.findElement(By.xpath("(//input[@type='button'])[7]"));
		    WebDriverWait wait85=new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.visibilityOf(Click5));
		    Click5.click();
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*//driver.get(props.getProperty("searchTerm"));
	Thread.sleep(5000);
	WebElement Red=driver.findElement(By.xpath("//a[text()='Rediffmail']"));
	System.out.println(Red.getText());
	Red.click();
	WebElement search =	driver.findElement(By.id("login1"));
search.sendKeys("Today");
System.out.println(search.getAttribute("value"));
		driver.navigate().to("https://www.facebook.com/r.php");
		List<WebElement> Web=driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(Web.size());
		Web.get(7).click();
		for(int i=0; i<=Web.size()-1;i++) {
			System.out.print(Web.get(i).getText()+ " ");
			Web.get(i).click();
			Web.get(7).click();
		}
		
		
		List<WebElement> Web1=driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println(Web1.size());
		for(int i=0; i<=Web1.size()-1;i++) {
			System.out.print(Web1.get(i).getText()+ " ");
			Web1.get(i).click();
			Web1.get(7).click();*/
	


