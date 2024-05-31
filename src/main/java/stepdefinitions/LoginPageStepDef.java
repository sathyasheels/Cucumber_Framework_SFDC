package stepdefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

import pages.BrowserConfiguration;
import pages.LoginPageCF;
import utils.FileUtils;


public class LoginPageStepDef {
	LoginPageCF lp=null;
	
	@Given("user is in login page")
	public void user_is_in_login_page() throws IOException {
	  WebDriver driver=BrowserConfiguration.getBrowserType("edge");
	  lp=new LoginPageCF(driver);
	  driver.get(FileUtils.readLoginPageCFTestData("test.app.url"));
		driver.manage().window().maximize();
	}

	@When("user enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() throws IOException {
	    lp.sendUsernamepassword(FileUtils.readLoginPageCFTestData("test.username"), FileUtils.readLoginPageCFTestData("test.password"));
	}

	@Then("user should land on homepage")
	public void user_should_land_on_homepage() {
		Assert.assertTrue(lp.verifyLoginsuccessful1());
	    }

	@When("user enters invalid username and valid password")
	public void user_enters_invalid_username_and_valid_password() throws IOException {
		lp.sendUsernamepassword(FileUtils.readLoginPageCFTestData("test.invalidusername"), FileUtils.readLoginPageCFTestData("test.password"));
	}

	@Then("user should get error message")
	public void user_should_get_error_message() throws IOException {
	   Assert.assertTrue(lp.verifyErrorMessage(FileUtils.readLoginPageCFTestData("expected.errormessage")));
	}

	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() throws IOException {
		lp.sendUsernamepassword(FileUtils.readLoginPageCFTestData("test.username"), FileUtils.readLoginPageCFTestData("test.invalidpassword"));  
	}

	@When("user enters invalid username and invalid password")
	public void user_enters_invalid_username_and_invalid_password() throws IOException {
		lp.sendUsernamepassword(FileUtils.readLoginPageCFTestData("test.invalidusername"), FileUtils.readLoginPageCFTestData("test.invalidpassword"));
	}




}
