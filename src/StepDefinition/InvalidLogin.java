package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class InvalidLogin {
	
	WebDriver driver;
	
	@Given("^User is on login page2 of ewallet$")
	public void user_is_on_login_page_of_ewallet() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\seliniumSoftware\\chromedriverFolder\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("http://localhost:4200/login");
		driver.manage().window().maximize();    
	}

	@When("^User enters invalid credentials$")
	public void user_enters_invalid_credentials() throws Throwable {
		driver.findElement(By.id("ln")).sendKeys("shivam");
		driver.findElement(By.id("pwd")).sendKeys("78784532");
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(3000);
	}

	@Then("^User should see a error message$")
	public void user_should_see_a_error_message() throws Throwable {
		String str1=driver.switchTo().alert().getText();
		System.out.println(str1);
		driver.switchTo().alert().accept();
		   String str=driver.getCurrentUrl().toString();
		   System.out.println("Current URL : "+str);
		   Assert.assertEquals("Invalid Credentials", str1);
		   driver.close();
	   
	}

}
