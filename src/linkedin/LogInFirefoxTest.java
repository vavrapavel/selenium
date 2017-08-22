package linkedin;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInFirefoxTest extends LinkedinTest {
	
	@Test
	public void test() throws InterruptedException {
		/* Enter valid credentials. */
		String username = "validemail@gmail.com";
		String password = "validpassword";
		
		WebDriver driver = new FirefoxDriver();
		driver.get(TARGET_URL);
		WebElement loginInput =
				 driver.findElement(By.name("session_key"));
		
		loginInput.sendKeys(username);
		WebElement passwordInput =
				 driver.findElement(By.name("session_password"));
		
		passwordInput.sendKeys(password);
		passwordInput.submit();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement memberNameSection = driver.findElement(By.xpath("//a[@data-control-name='identity_welcome_message']"));
		Assert.assertEquals(true, memberNameSection.isDisplayed());
		  		 
	}

}
