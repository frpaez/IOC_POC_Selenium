package TestCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_005 {
	@Test 
	public void main() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\klopezpaz\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
        driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		//driver.findElement(By.className("shopping_cart_link")).click();
		//driver.findElement(By.id("continue-shopping")).click();
		//driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		driver.close();
		

	}

}
