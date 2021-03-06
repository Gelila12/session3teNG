package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebElement {

	WebDriver driver;

	@Before
public void launchBrowser() {
	
System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");	
driver = new ChromeDriver();
driver.get("https://www.cnn.com/");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}	
	
 @Test
 public void	dealWithDynamicWebElement() {
	
	driver.findElement(By.xpath("//h2[@class='banner-text screaming-banner-text banner-text-size--char-47']/parent::a/parent::article")).click();
	
}	
	
	
}
