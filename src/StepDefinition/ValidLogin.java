package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidLogin {
	
	WebDriver driver;
	
@Given("^User is on login page1 of ewallet$")
public void user_is_on_login_page_of_ewallet() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\seliniumSoftware\\chromedriverFolder\\chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.get("http://localhost:4200/login");
	driver.manage().window().maximize();
   
}

@When("^User enters valid credentials$")
public void user_enters_valid_credentials() throws Throwable {
	driver.findElement(By.id("ln")).sendKeys("vinay");
	driver.findElement(By.id("pwd")).sendKeys("7983971616");
	driver.findElement(By.id("submitbutton")).click();
   
}

@Then("^message displayed login successfully$")
public void message_displayed_login_successfully() throws Throwable {
	System.out.println("Login successfull You are on User Dashboard ");
	   Thread.sleep(4000);
	   String str=driver.getCurrentUrl().toString();
	   System.out.println("Current URL : "+str);
	   driver.findElement(By.id("logoutbtn")).click();
	   Thread.sleep(2000);
	   System.out.println("successfully Logged out");
	   String str1=driver.getCurrentUrl().toString();
	   System.out.println("Current URL : "+str1);
	   
	   driver.close();
  
}



}
