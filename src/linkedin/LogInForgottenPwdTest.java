package linkedin;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInForgottenPwdTest extends LinkedinTest {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get(TARGET_URL);
		WebElement forgottenPwdLink =
				 driver.findElement(By.className("link-forgot-password"));
		forgottenPwdLink.click();
		WebElement pwdResetBox =
				 driver.findElement(By.id("userName-requestPasswordReset"));	
		Assert.assertEquals(true, pwdResetBox.isDisplayed());
		
	}

}
