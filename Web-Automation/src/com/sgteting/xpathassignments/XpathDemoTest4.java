package com.sgteting.xpathassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemoTest4 {

	public static WebDriver oBbrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
	    modifycustomer();
		//deletecustomer();
		//logout();
		//closeBrowser();	
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBbrowser=new ChromeDriver();
			oBbrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	static void navigate()
	{
		try
		{
			oBbrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBbrowser.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");Thread.sleep(1000);
			oBbrowser.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");Thread.sleep(1000);
			oBbrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBbrowser.findElement(By.xpath("//div[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createcustomer()
	{
		try
		{
			oBbrowser.findElement(By.xpath("//a[@class='content tasks']")).click();
			Thread.sleep(1000);
			oBbrowser.findElement(By.xpath("//div[@class='addNewButton']")).click();
			Thread.sleep(1000);
			oBbrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			oBbrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("customer1");
			oBbrowser.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	static void modifycustomer()
	{
		try
		{
			oBbrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(1000);
			oBbrowser.findElement(By.xpath("//textarea[@class='textarea']")).sendKeys("123");
			Thread.sleep(2000);
			oBbrowser.findElement(By.xpath("//div[contains(@class, 'edit_customer_sliding_panel sliding_panels')]//div[contains(@class,'closeButton')]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	static void deletecustomer()
	{
		try
		{
			oBbrowser.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(1000);
			oBbrowser.findElement(By.xpath("//div[@class='action']")).click();
			Thread.sleep(1000);
			oBbrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(1000);
			oBbrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}static void logout()
	{
		try
		{
			oBbrowser.findElement(By.xpath("//a[@class='logout']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeBrowser()
	{
		try
		{	
			oBbrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
