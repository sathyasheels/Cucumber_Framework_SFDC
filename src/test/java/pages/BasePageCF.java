package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageCF{
	
	public BasePageCF(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
