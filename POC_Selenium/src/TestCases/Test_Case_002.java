package TestCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_002 {
	@Test 
	public  void main() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\klopezpaz\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
        driver.manage().window().maximize();
		driver.get("https://cms.demo.katalon.com/my-account");
		driver.findElement(By.id("username")).sendKeys("customer");
		driver.findElement(By.id("password")).sendKeys("crz7mrb.KNG3yxv");
		driver.findElement(By.className("woocommerce-button")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Lost your password?")).isDisplayed());
		driver.close();

	}

}
