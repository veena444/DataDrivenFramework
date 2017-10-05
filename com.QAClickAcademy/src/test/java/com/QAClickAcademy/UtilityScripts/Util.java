package com.QAClickAcademy.UtilityScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	
	// get data from Config.properties file
	public static String getPropertyFile(String key){
		FileInputStream fis=null;
		try{
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties");
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		Properties prop =new Properties();
		try{
			prop.load(fis);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
	//Explicit wait
	
	public static WebDriverWait wait(WebDriver driver){
		WebDriverWait w = new WebDriverWait(driver,30);		
		return w;
	}

}
