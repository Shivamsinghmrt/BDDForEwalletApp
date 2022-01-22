package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class ValidUserUpdate {
	
	WebDriver driver;
	
	@Given("^User is logged in and on userdashboard$")
	public void user_is_logged_in_and_on_userdashboard() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\seliniumSoftware\\chromedriverFolder\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("http://localhost:4200/login");
		driver.manage().window().maximize();
	   Thread.sleep(8000);
		driver.findElement(By.id("ln")).sendKeys("vinay");
		driver.findElement(By.id("pwd")).sendKeys("7983971616");
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(3000);
	}

	@When("^User click on update button$")
	public void user_click_on_update_button() throws Throwable {
		driver.findElement(By.id("updatebtn")).click();
		Thread.sleep(2000);
		
	}

	@When("^inserts valid inputs in the field$")
	public void inserts_valid_inputs_in_the_field() throws Throwable {
		driver.findElement(By.id("LoginName1")).sendKeys("vinay kumar");
		driver.findElement(By.id("UserFullName1")).sendKeys("vinay kumar Garg");
		driver.findElement(By.id("AadhaarNumber1")).sendKeys("7568973435683");
		driver.findElement(By.id("Password1")).sendKeys("598629842");
		
		
	}

	@When("^User click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		driver.findElement(By.id("updatesubmit")).click();
		Thread.sleep(6000);
	}

	@Then("^message displayed updation successfull$")
	public void message_displayed_updation_successfull() throws Throwable {
		String str1=driver.switchTo().alert().getText();
		System.out.println(str1);
		Assert.assertEquals("you have successfully updated!", str1);
		driver.switchTo().alert().accept();
		System.out.println("updation successfull");
		String str=driver.getCurrentUrl().toString();
		   System.out.println("Current URL : "+str);
		   driver.findElement(By.id("logoutbtn")).click();
		   Thread.sleep(2000);
		   System.out.println("successfully Logged out");
		   String str2=driver.getCurrentUrl().toString();
		   System.out.println("Current URL : "+str2);
		   
		driver.close();
	}



}
