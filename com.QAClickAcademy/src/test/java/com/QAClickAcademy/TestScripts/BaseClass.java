package com.QAClickAcademy.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.QAClickAcademy.UtilityScripts.Util;


public class BaseClass extends Util{
	
public WebDriver driver;
		
	public WebDriver launchBrowser(){
		String browserType=Util.getPropertyFile("browsertype");
		if(browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", Util.getPropertyFile("ChromeDriverPath"));
			driver=new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.driver", Util.getPropertyFile("FirefoxDriverPath"));
			driver=new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", Util.getPropertyFile("IEDriverPath"));
			driver=new InternetExplorerDriver();
		}
		return driver;
	}
	
	public void tearDown(){
		if(driver != null){
			driver.quit();
		}
	}


}
