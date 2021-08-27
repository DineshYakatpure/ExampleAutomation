package com.sgtesting.practiceassingments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMAssingment2 {
	public static WebDriver oBrowser=null;
	public static  ActiTimePagesWhole opage=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			flyOutWindow();
			createUser();
			deleteUser();
			logout();
			closeApplication();

		}
		static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				//opage=new ActiTimePagesWhole(oBrowser);
				oBrowser.manage().window().maximize();
				
			}catch(Exception e)
			{
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
		
		static void login()
		{
			try
			{
				opage=new ActiTimePagesWhole(oBrowser);
				opage.getusername().sendKeys("admin");
				opage.getpassword().sendKeys("manager");
				opage.getLoginButton().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void flyOutWindow()
		{
			try
			{
				opage.CloseFlyoutWindow().click();
				Thread.sleep(4000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void createUser()
		{
			try
			{
				opage.createElementlogo().click();
				Thread.sleep(4000);
				opage.adduserbuttonlogo().click();
				Thread.sleep(4000);
				opage.addUserfirstname().sendKeys("Demo1");
				opage.addUserlastname().sendKeys("User1");
				opage.addUseremail().sendKeys("deenesh16@gmail.com");
				opage.addUserUsername().sendKeys("user1");
				opage.addUserpassword().sendKeys("Welcome1");
				opage.addUserRepassword().sendKeys("Welcome1");
				opage.createUserButtonlogo().click();
				Thread.sleep(6000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void deleteUser()
		{
			try
			{
				opage.deleteUser().click();
				Thread.sleep(4000);
				opage.deleteUserButton().click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		static void logout()
		{
			try
			{
				opage.getLogoutButton().click();
				Thread.sleep(4000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		static void closeApplication()
		{
			try
			{
				oBrowser.close();

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}


	}
