package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class Loginpage extends BaseClass{
static String o="standard_user",o2="secret_sauce";
	public static void main(String[] args) {
		String s="https://www.saucedemo.com/";
		BaseClass baseClass = new BaseClass();
		baseClass.chromedriver();
		baseClass.Url(s);
		driver=baseClass.Websodriver();
		
		WebElement k=driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement k2=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement k3=driver.findElement(By.xpath("//input[@id='login-button']"));
		baseClass.sendokeys(k,o);
		baseClass.sendokeys(k2,o2);
		baseClass.click(k3);
		
	}

}
