package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LearningLogin {
	/*
	WebDriver driver = null;
	
	
	@Given("luanch the browser")
	public void luanch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana Pattar\\eclipse-workspace\\SeleniumJava\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	}

	@And("user on login page")
	public void user_on_login_page() {
	driver.get("https://login.retool.com/auth/login?source=homepage");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.xpath("//input[@id=':r0:-form-item']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id=':r1:-form-item']")).sendKeys(password);
	   
	}

	@And("User click on login")
	public void user_click_on_login() {
		driver.findElement(By.xpath("//button[@type='submit']//div[@class='IFXHXl wDXZP1']")).click();
	 
	}

	@Then("verify user on home page")
	public void verify_user_on_home_page() {
		Boolean sucessfullhomepage = driver.getPageSource().contains("Welcome");
		System.out.println(sucessfullhomepage);
	    
	}

*/
}
