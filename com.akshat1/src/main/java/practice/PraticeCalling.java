package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

public class PraticeCalling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		
		Practice1 ok=new Practice1();
		ok.info();
		
	WebElement OKS=	driver.findElement(By.xpath("///select"));
	ok.ckc(OKS);
	}

}
