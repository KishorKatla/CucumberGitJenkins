package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;

	@Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.opera.driver", "operadriver.exe");
		driver = new OperaDriver();
		driver.navigate().to("http://facebook.com");

	}

	@When("^I enter valid userName and valid password$")
	public void i_enter_valid_userName_and_valid_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("katla.kishor@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Kritika2009");
	
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
		String str = driver.getTitle();
		System.out.println(str);

	}

	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {

		driver.quit();
	}

}
