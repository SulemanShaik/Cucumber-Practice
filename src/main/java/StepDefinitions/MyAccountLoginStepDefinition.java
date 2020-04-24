package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



//ctrl+shift+O to get packages

public class MyAccountLoginStepDefinition {

	WebDriver driver;

	@Given("Launch browser")
	public void launch_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@When("User enters url {string}")
	public void user_enters_url(String url) {
		driver.get(url);
	}

	@When("click on myaccount link")
	public void click_on_myaccount_link() {
		driver.findElement(By.linkText("My Account")).click();
	}

	
	
	/*@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String uname, String pwd) {
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
	    
	}*/
	
	//login with data table method
	/*@When("User enters username and password")
	public void user_enters_username_and_password(DataTable Datatable) {
		List<List<String>> data=Datatable.raw();
		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}*/
	
	
	//login with data table method using header path-Map table
	
	@When("User enters username and password")
	public void user_enters_username_and_password(DataTable Datatable) {
		List<Map<String,String>>data=Datatable.asMaps(String.class,String.class);
		
		driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
		
	}
	
	

	@When("user click on Login button")
	public void user_click_on_Login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("user should see login dashboard")
	public void user_should_see_login_dashboard() {
		// Assert.assertTrue(driver.getTitle().contains("My Account-Automation Practice
		// Site"));

		WebElement ele = driver.findElement(By.xpath("//div[@id='body']//p[1]"));
		if (ele.getText().contains("sulemanshaik6786 ")) 
		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		driver.close();
	}

	/*@Then("close browser")
	public void close_browser() {
		driver.close();
	}*/
	
	@Then("very login")
	public void very_login() {
		/*WebElement ele1 = driver.findElement(By.xpath("[@id=\"page-36\"]/div/div[1]/ul/li/strong[1]"));
		if (ele1.getText().contains("ERROR")) //For Invalid inputs
		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}*/
		//*[@id="page-36"]/div/div[1]/ul/li/strong[1]
		
		
	    
	}

	

	
}
