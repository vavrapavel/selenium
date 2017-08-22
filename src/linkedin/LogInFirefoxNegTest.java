package linkedin;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInFirefoxNegTest extends LinkedinTest {

	
	@Test
	public void test() {
		String username = "invalidemail@gmail.com";
		String password = "invalidpwd";
		
		WebDriver driver = new FirefoxDriver();
		driver.get(TARGET_URL);
		WebElement loginInput =
				 driver.findElement(By.name("session_key"));		
		loginInput.sendKeys(username);
		WebElement passwordInput =
				 driver.findElement(By.name("session_password"));		
		passwordInput.sendKeys(password);
		passwordInput.submit();
		
		loginInput =
				 driver.findElement(By.name("session_key"));
		passwordInput =
				 driver.findElement(By.name("session_password"));
		Assert.assertEquals(true, loginInput.isDisplayed());
		Assert.assertEquals(true, passwordInput.isDisplayed());
		Assert.assertEquals(0, driver.findElements(By.xpath("//a[@data-control-name='identity_welcome_message']")).size());
	}

}
