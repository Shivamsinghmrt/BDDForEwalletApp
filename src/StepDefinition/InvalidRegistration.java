package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class InvalidRegistration {
	
	WebDriver driver;
	
	@Given("^User is on registration page2 of ewallet$")
	public void user_is_on_registration_page_of_ewallet() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\seliniumSoftware\\chromedriverFolder\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("http://localhost:4200/register");
		driver.manage().window().maximize();

	}

	@When("^User enters invalid inputs in fields$")
	public void user_enters_invalid_inputs_in_fields() throws Throwable {
	
			driver.findElement(By.id("ln")).sendKeys("Rahul");
			driver.findElement(By.id("ufn")).sendKeys("Rahul Garg");
			driver.findElement(By.id("Aadharno")).sendKeys("987654321987");
			driver.findElement(By.id("pno")).sendKeys("598629842");
			driver.findElement(By.id("Password1")).sendKeys("2222222222");
			
			driver.findElement(By.id("submitbutton")).click();
			Thread.sleep(6000);
	}

	@Then("^message displayed registration Unsuccessfull$")
	public void message_displayed_registration_Unsuccessfull() throws Throwable {
		String str1=driver.switchTo().alert().getText();
		System.out.println(str1);
		  Assert.assertEquals("User With This Aadhar Number Already Available", str1);
		driver.switchTo().alert().accept();
		driver.close();  
	}



}
