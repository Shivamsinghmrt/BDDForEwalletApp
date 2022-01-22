package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class ValidRegistration {
	
	WebDriver driver;
	
	@Given("^User is on registration page1 of ewallet$")
	public void user_is_on_registration_page_of_ewallet() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\seliniumSoftware\\chromedriverFolder\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("http://localhost:4200/register");
		driver.manage().window().maximize();

	}

	@When("^User enters valid inputs in fields$")
	public void user_enters_valid_inputs_in_fields() throws Throwable {
		driver.findElement(By.id("ln")).sendKeys("Manish");
		driver.findElement(By.id("ufn")).sendKeys("Manish Garg");
		driver.findElement(By.id("Aadharno")).sendKeys("983334321989");
		driver.findElement(By.id("pno")).sendKeys("6669836745");
		driver.findElement(By.id("Password1")).sendKeys("89898989");
		
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(6000);
	}

	@Then("^message displayed registration successfully$")
	public void message_displayed_registration_successfully() throws Throwable {
		String str1=driver.switchTo().alert().getText();
		System.out.println(str1);
		Assert.assertEquals("your account is successfully created and your account id is 6669836745", str1);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}



}
