package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearningloginPom {
	
	WebDriver driver;
	
	By usernmae_tx = By.xpath("//input[@id=':r0:-form-item']");
	By Password_tx = By.xpath("//input[@id=':r1:-form-item']");
	By click_tx = By.xpath("//button[@type='submit']//div[@class='IFXHXl wDXZP1']");
	By textvisible_result = By.xpath("//h5[normalize-space()='Recent']");
	
	public LearningloginPom(WebDriver driver)
	{
		 this.driver = driver;
	}
	
	
	public void enter_username(String username)
	{
		driver.findElement(usernmae_tx).sendKeys(username);
	}
	public void enter_password(String password)
	{
		driver.findElement(Password_tx).sendKeys(password);
	}
	public void click_login()
	{
		driver.findElement(click_tx).click();
	}
	public void homepage_validatation()
	{
 boolean result = driver.findElement(textvisible_result).isDisplayed();
	System.out.println(result);
	}

}
