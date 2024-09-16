package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfiguration {
public static WebDriver getBrowserType(String browserName) {
		
		WebDriver driver;
		String browser=browserName.toLowerCase();
		switch(browser)
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
			driver=null;
			break;
		}
		
		return driver;
		
	}
	

}
