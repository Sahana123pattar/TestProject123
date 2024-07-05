package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver = null;
	
	@Given("browser opens")
	public void browser_opens() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana Pattar\\eclipse-workspace\\SeleniumJava\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	    
	}

	@And("user on google search box")
	public void user_on_google_search_box() {
	driver.get("https://google.com");
	    
	}

	@When("User enters keywords in search box")
	public void user_enters_keywords_in_search_box() throws InterruptedException {
		
 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation test for ui");

	}

	 @When("click enter")
	public void click_enter() {
		
		driver.findElement(By.xpath("https://google.com")).sendKeys(Keys.ENTER);	
	    
	  }

	@Then("check the result")
	public void check_the_result() {
	boolean Result	= driver.getPageSource().contains("People also ask");
	    System.out.println(Result);
	   
	}

	@And("close the browser")
	public void close_the_browser() {
		
	    driver.close();
	    
	}


}
