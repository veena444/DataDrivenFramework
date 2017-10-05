
package com.QAClickAcademy.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@class='col-sm-6 col-md-8 hidden-xs video-banner']/h3")
	public static WebElement HomePageText;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	
	public void verifyHomePage(){
		String expectedTitle="An Academy to learn Everything about Testing";
		String actualTitle=HomePageText.getText();
		try{
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("We are in Home Page");
		}
		catch(Throwable e){
			System.out.println(e.getMessage());
		}
	}

}
