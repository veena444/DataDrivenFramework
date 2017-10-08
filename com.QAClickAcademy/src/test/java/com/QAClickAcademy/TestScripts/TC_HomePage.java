package com.QAClickAcademy.TestScripts;


import org.testng.annotations.Test;

import com.QAClickAcademy.PageObjects.HomePage;
import com.QAClickAcademy.PageObjects.LoginPage;
import com.QAClickAcademy.UtilityScripts.Util;


public class TC_HomePage extends BaseClass {
	
	@Test
	
     public void verifyHomePageText(){
		driver=launchBrowser();
		driver.manage().window().maximize();
		driver.get(Util.getPropertyFile("URL"));
		Util.wait(driver);
		HomePage hp =new HomePage(driver);
		hp.verifyHomePage();
		hp.homePageLogin();
		LoginPage lp = new LoginPage(driver);
		lp.loginToQAClickAcademy();
		
		
		
	}
	
	
	
	

}
