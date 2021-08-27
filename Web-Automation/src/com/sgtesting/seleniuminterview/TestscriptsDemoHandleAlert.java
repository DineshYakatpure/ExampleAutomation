package com.sgtesting.seleniuminterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestscriptsDemoHandleAlert {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		 navigate();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\\\ExampleAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			 oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch( Exception e) {
			e.printStackTrace();
			
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
