package TestCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_003 {
	@Test
	public void main() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\klopezpaz\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
        driver.manage().window().maximize();
		driver.get("https://services.smartbear.com/samples/TestComplete12/smartstore/");
		driver.findElement(By.linkText("LOG IN")).click();
		driver.findElement(By.id("UsernameOrEmail")).sendKeys("cromansantillan");
		driver.findElement(By.id("Password")).sendKeys("Test9876");
		driver.findElement(By.className("btn-login")).click();
		driver.close();

	}

}
