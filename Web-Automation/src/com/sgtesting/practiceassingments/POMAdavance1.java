package com.sgtesting.practiceassingments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMAdavance1 {
	public static WebDriver oBrowser=null;
	public static  ActiTimePagesWhole opage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginUser1();
		modifyUser1Password();
		logoutUser1();
		loginUser2();
		modifyUser2Password();
		logoutUser2();
		loginUser3();
		modifyUser3Password();
		logoutUser3();
		loginModifyUser1();
		logoutModifyUser1();
		loginModifyUser2();
		logoutModifyUser2();
		loginModifyUser3();
		logoutModifyUser3();
		loginAsAdmin();
		deleteUser1();
		deleteUser2();
		deleteUser3();
		logoutAsAdmin();
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
	static void createUser1()
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
	static void createUser2()
	{
		try
		{
			opage.createElementlogo().click();
			Thread.sleep(4000);
			opage.adduserbuttonlogo().click();
			Thread.sleep(4000);
			opage.addUserfirstname().sendKeys("Demo2");
			opage.addUserlastname().sendKeys("User2");
			opage.addUseremail().sendKeys("deenesh16@gmail.com");
			opage.addUserUsername().sendKeys("user2");
			opage.addUserpassword().sendKeys("Welcome2");
			opage.addUserRepassword().sendKeys("Welcome2");
			opage.createUserButtonlogo().click();
			Thread.sleep(6000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{
		try
		{
			opage.createElementlogo().click();
			Thread.sleep(4000);
			opage.adduserbuttonlogo().click();
			Thread.sleep(4000);
			opage.addUserfirstname().sendKeys("Demo3");
			opage.addUserlastname().sendKeys("User3");
			opage.addUseremail().sendKeys("deenesh16@gmail.com");
			opage.addUserUsername().sendKeys("user3");
			opage.addUserpassword().sendKeys("Welcome3");
			opage.addUserRepassword().sendKeys("Welcome3");
			opage.createUserButtonlogo().click();
			Thread.sleep(6000);
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
	static void loginUser1()
	{
		try
		{
			opage=new ActiTimePagesWhole(oBrowser);
			
			opage.getusername().sendKeys("user1");
			opage.getpassword().sendKeys("Welcome1");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.startActiTimeLink().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser1Password()
	{
		try
		{
			opage.createElementlogo().click();
			Thread.sleep(4000);
			opage.deleteUser().click();
			Thread.sleep(4000);
			opage.addUserpassword().clear();
			opage.addUserpassword().sendKeys("Welcome11");
			opage.addUserRepassword().clear();
			opage.addUserRepassword().sendKeys("Welcome11");
			opage.modifyUserButton().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser1()
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
	static void loginUser2()
	{
		try
		{
			opage=new ActiTimePagesWhole(oBrowser);
			opage.getusername().sendKeys("user2");
			opage.getpassword().sendKeys("Welcome2");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.startActiTimeLink().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser2Password()
	{
		try
		{
			opage.createElementlogo().click();
			Thread.sleep(4000);
			opage.deleteUser2().click();
			Thread.sleep(4000);
			opage.addUserpassword().clear();
			opage.addUserpassword().sendKeys("Welcome22");
			opage.addUserRepassword().clear();
			opage.addUserRepassword().sendKeys("Welcome22");
			opage.modifyUserButton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser2()
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
	static void loginUser3()
	{
		try
		{
			opage=new ActiTimePagesWhole(oBrowser);
			opage.getusername().sendKeys("user3");
			opage.getpassword().sendKeys("Welcome3");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.startActiTimeLink().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser3Password()
	{
		try
		{
			opage.createElementlogo().click();
			Thread.sleep(4000);
			opage.deleteUser3().click();
			Thread.sleep(4000);
			opage.addUserpassword().clear();
			opage.addUserpassword().sendKeys("Welcome33");
			opage.addUserRepassword().clear();
			opage.addUserRepassword().sendKeys("Welcome33");
			opage.modifyUserButton().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutUser3()
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
	static void loginModifyUser1()
	{
		try
		{
			opage=new ActiTimePagesWhole(oBrowser);
			
			opage.getusername().sendKeys("user1");
			opage.getpassword().sendKeys("Welcome11");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.startActiTimeLink().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutModifyUser1()
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
	static void loginModifyUser2()
	{
		try
		{
			opage=new ActiTimePagesWhole(oBrowser);
			
			opage.getusername().sendKeys("user2");
			opage.getpassword().sendKeys("Welcome22");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.startActiTimeLink().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutModifyUser2()
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
	static void loginModifyUser3()
	{
		try
		{
			opage=new ActiTimePagesWhole(oBrowser);
			
			opage.getusername().sendKeys("user3");
			opage.getpassword().sendKeys("Welcome33");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			opage.startActiTimeLink().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutModifyUser3()
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

	static void loginAsAdmin()
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
	static void deleteUser1()
	{
		try
		{
			opage.createElementlogo().click();
			Thread.sleep(4000);
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
	static void deleteUser2()
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
	static void deleteUser3()
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
	static void logoutAsAdmin()
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


