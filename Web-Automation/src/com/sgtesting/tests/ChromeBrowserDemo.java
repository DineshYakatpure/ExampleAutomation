package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		getTitle();
	}
	
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			System.out.println(path);
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		static void navigate()
		{
			try
			{
				//oBrowser.get("http://localhost:81/login.do");
				//oBrowser.get("https://www.youtube.com/watch?v=m6iqdzITwmg&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=4");
				oBrowser.get("https://www.facebook.com/");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}


static void getTitle()
{
	try
	{
		System.out.println(oBrowser.getTitle());
		System.out.println(oBrowser.getCurrentUrl());
		System.out.println(oBrowser.getPageSource());
		oBrowser.quit();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}







