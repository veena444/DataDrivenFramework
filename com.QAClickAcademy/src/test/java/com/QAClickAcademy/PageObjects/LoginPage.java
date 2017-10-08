package com.QAClickAcademy.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QAClickAcademy.UtilityScripts.Util;

public class LoginPage {
	
	WebDriver driver;	
	
	@FindBy(id="user_email")
	public static WebElement Email;
	
	@FindBy(id="user_password")
	public static WebElement Password;
	
	@FindBy(xpath="//*[@class='btn btn-primary btn-md login-button']")
	public static WebElement LogIn;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
			
	
	public void loginToQAClickAcademy(){
		Email.sendKeys(Util.getPropertyFile("Uid"));
		Password.sendKeys(Util.getPropertyFile("Pwd"));
		LogIn.click();
	}
	

}
