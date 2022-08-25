package TestCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_004 {
	@Test 
	public void main() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\klopezpaz\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
        driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Assert.assertTrue(driver.findElement(By.className("error-button")).isDisplayed());
		driver.close();
		//driver.findElement(By.id("react-burger-menu-btn")).click();
		//driver.findElement(By.id("logout_sidebar_link")).click();
				

	}

}
