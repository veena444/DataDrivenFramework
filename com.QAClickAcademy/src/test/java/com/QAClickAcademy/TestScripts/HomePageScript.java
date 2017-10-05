package com.QAClickAcademy.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.QAClickAcademy.PageObjects.HomePage;
import com.QAClickAcademy.UtilityScripts.Util;

public class HomePageScript {
	
	WebDriver driver;
	
	@BeforeClass
	
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", Util.getPropertyFile("ChromeDriverPath"));
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Util.getPropertyFile("URL"));
	
	}
	
	@AfterClass
	
	public void tearDown(){
		if(driver != null){
		driver.quit();
		
		
		}
	}
	
	@Test
	
	public void verifyHomePageText(){
		Util.wait(driver);
		HomePage hp =new HomePage(driver);
		hp.verifyHomePage();
	}

}
