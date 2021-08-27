package com.sgteting.xpathassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemoTest1 {

	public static WebDriver oBbrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		/*minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeBrowser();*/

	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriverew.exe");
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

	static void createUser()
	{
		try
		{
			oBbrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content users']")).click();
			Thread.sleep(2000);
			oBbrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			Thread.sleep(2000);
			oBbrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).sendKeys("scott");
			oBbrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")).sendKeys("king");
			oBbrowser.findElement(By.xpath("//input[@type='text'and@name='email']")).sendKeys("scott123@gmail.com");
			oBbrowser.findElement(By.xpath("//input[@type='text'and@name='username']")).sendKeys("Scott123");
			oBbrowser.findElement(By.xpath("//input[@type='password'and@name='password']")).sendKeys("12getgo");
			oBbrowser.findElement(By.xpath("//input[@type='password'and@name='passwordCopy']")).sendKeys("12getgo");
			oBbrowser.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			oBbrowser.navigate().refresh();
			oBbrowser.findElement(By.xpath("//tr[1]//td[@class='userNameCell first']")).click();
			Thread.sleep(2000);				
			oBbrowser.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert obj=oBbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void logout()
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