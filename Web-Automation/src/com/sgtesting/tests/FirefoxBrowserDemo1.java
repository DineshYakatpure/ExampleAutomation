package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
	
	
		launchBrowser();
		
	}
	

	static void launchBrowser()
	{
		String path=null;
		try
		{
			 path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", path+"\\Library\\drivers\\geckodrivernew.exe");
			//System.setProperty("webdriver.gecko.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodrivernew.exe");
			oBrowser=new FirefoxDriver();
			//oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
	
