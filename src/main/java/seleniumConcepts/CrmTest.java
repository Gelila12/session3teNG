package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrmTest {

	WebDriver driver;
	@Before
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void loginTest() {
		
		//element liberary
		//1,storing web element
		WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement SIGNIN_FIELD_ELEMENT = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		//2,storing web element using by class
		 By USERNAME_FIELD_LOCATER = By.xpath("//input[@id='username']");
		 By PASSWORD_FIELD_LOCATER = By.xpath("//*[@id=\"password\"]");
		 By SIGNIN_FIELD_LOCATER = By.xpath("/html/body/div/div/div/form/div[3]/button");
		 
		driver.findElement(USERNAME_FIELD_LOCATER).sendKeys("demo@techfios.com");
		USERNAME_FIELD_ELEMENT.clear();
		USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
	    PASSWORD_FIELD_ELEMENT.clear();
		PASSWORD_FIELD_ELEMENT.sendKeys("abc123");
		SIGNIN_FIELD_ELEMENT.click();
	
		
		
	
	
	
	}
	
	
	
}
