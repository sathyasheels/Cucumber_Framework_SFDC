package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageCF extends BasePageCF {

	public LoginPageCF(WebDriver driver) {
		super(driver);

	}
	
	
	@FindBy(id="username")
    public WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(name="Login")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[@id='rememberUn']")
	public WebElement rememberMe;
	
	@FindBy(id="error")
	public WebElement errorMessage;
	
	@FindBy(partialLinkText="Forgot")
	public WebElement forgotPassword;
	
	@FindBy(xpath="//span[text()='sheela@hexaware.com']")
	public WebElement savedUsername;
	
	@FindBy(xpath="//input[@id='un']")
	public WebElement forgotUsernameTextbox;
	
	@FindBy(xpath="//span[@class='helpLink']")
	public WebElement landingPage;
	
	public boolean verifyLoginSuccessful(String name,String pwd) {
		boolean isLoginSuccessful=false;
		if(username.isDisplayed()) {
			username.sendKeys(name);
			password.clear();
			password.sendKeys(pwd);
			loginButton.click();
		}if(landingPage.isDisplayed()) {
			isLoginSuccessful=true;
		}
		return isLoginSuccessful;
	}
	
	public void sendUsernamepassword(String name,String pwd) {
		if(username.isDisplayed()) {
			username.sendKeys(name);
			password.clear();
			password.sendKeys(pwd);
		}
			loginButton.click();
	}
	
	public boolean verifyLoginsuccessful1() {
		boolean isLoginSuccessful=false;
		if(landingPage.isDisplayed()) {
			isLoginSuccessful=true;
		}
		return isLoginSuccessful;
	}
	
	@FindBy(xpath="//form[@id='login_form']//child::div[@class='loginError']")
	public WebElement errorMessage2;
	
	public boolean verifyErrorMessage(String expectederrormessage ) {
		boolean isErrorMessagedisplayedCorrectly=false;
		if(errorMessage2.isDisplayed()) {
			String actaualerrormessage2=errorMessage2.getText();
			if(actaualerrormessage2.equals(expectederrormessage)) {
				isErrorMessagedisplayedCorrectly=true;
			}
		}
		return isErrorMessagedisplayedCorrectly;
	}

}
