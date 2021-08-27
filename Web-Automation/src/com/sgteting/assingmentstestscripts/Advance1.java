package com.sgteting.assingmentstestscripts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//1. LaunchBrowser--> navigate --> login as admin--> Create 3 users those are a) user1 b) user2 c)user3 --> Logout -->login as user1 --> Logout --> login as user2 --> logout -->login as user3 --> logout --> login as admin --> delete a) user1 b) user2 c)user3 --> logout --> close application

public class Advance1 {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		 navigate();
		 login();
		 minimizeFlyOutWindow();
		 createUser();
		 logout();
		 loginuser1();
		 logout1();
		 loginuser2();
		 logout2();
		 loginuser3();
		 logout3();
		 login1();
		 deleteUsers();
		 logout4();
		 closeApplication();
	}
	static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\\\ExampleAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			obrowser=new ChromeDriver();
		 obrowser.manage().window().maximize();
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	static void navigate()
	{
		try
		{
			obrowser.get("http://localhost:81/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo1");
			obrowser.findElement(By.name("lastName")).sendKeys("User");
            obrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("demo1User1");
			obrowser.findElement(By.name("password")).sendKeys("create");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("create");
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("  //*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo2");
			obrowser.findElement(By.name("lastName")).sendKeys("User");
            obrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("demo2User");
			obrowser.findElement(By.name("password")).sendKeys("create");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("create");
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("  //*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo3");
			obrowser.findElement(By.name("lastName")).sendKeys("User");
            obrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			obrowser.findElement(By.name("username")).sendKeys("demo3User");
			obrowser.findElement(By.name("password")).sendKeys("create");
			obrowser.findElement(By.name("passwordCopy")).sendKeys("create");
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			obrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser1()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("demo1User1");
			obrowser.findElement(By.name("pwd")).sendKeys("create");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout1()
	{
		try
		{
			obrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser2()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("demo2User");
			obrowser.findElement(By.name("pwd")).sendKeys("create");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout2()
	{
		try
		{
			obrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser3()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("demo3User");
			obrowser.findElement(By.name("pwd")).sendKeys("create");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout3()
	{
		try
		{
			obrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login1()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUsers()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=obrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert1=obrowser.switchTo().alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert11=obrowser.switchTo().alert();
			String content11=oAlert11.getText();
			System.out.println(content11);
			oAlert11.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout4()
	{
		try
		{
			obrowser.findElement(By.linkText("Logout")).click();
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
			obrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
