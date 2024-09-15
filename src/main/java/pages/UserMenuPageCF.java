package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserMenuPageCF extends BasePageCF{
	
	public UserMenuPageCF(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(xpath="//span[@id='userNavLabel']")
	public WebElement userMenu;
	
	@FindBy(xpath="//div[@id='userNav-menuItems']/a")
	public List<WebElement> userMenuOptions;
	
	@FindBy(xpath="//div[@id='userNav-menuItems']/a[1]")
	public WebElement myProfile;
	
	@FindBy(xpath="//div[@id='userNav-menuItems']/a[2]")
	public WebElement mySettings;
	
	@FindBy(xpath="//div[@id='userNav-menuItems']/a[3]")
	public WebElement developerConsole;
	
	@FindBy(xpath="//div[@id='userNav-menuItems']/a[4]")
	public WebElement lightningExperience;
	
	@FindBy(xpath="//div[@id='userNav-menuItems']/a[5]")
	public WebElement logout;
	
	@FindBy(xpath="//a[text()='Feed']")
	public WebElement myProfilePage;
	
	
	
	

}
