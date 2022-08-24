package Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Katalon {
	  public void loadKatalon() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\klopezpaz\\Documents\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver ();
	        driver.get("https://cms.demo.katalon.com/my-account");
	    }

	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement userpassword;
	
	@FindBy(className= "woocommerce-button")
	public WebElement button;
	

}

