package com.sgtesting.practiceassingments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePagesWhole {
	public   ActiTimePagesWhole(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
		
	}
	//create webelement for Username TextField
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}
	//create webelement for password TextField
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	//create webelement for login TextField
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement ologin;
	public WebElement getLoginButton()
	{
		return ologin;
	}
	//create webelement for logout TextField
	@FindBy(linkText="Logout")
	private WebElement ologout;
	public WebElement getLogoutButton()
	{
		return ologout;
	}
	// create WebElement for flyoutwindow
	private WebElement gettingStartedShortcutsMenuCloseId;
	public WebElement CloseFlyoutWindow() 
	{
		return gettingStartedShortcutsMenuCloseId;
		
	}
	// create WebElement for crateuser
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
	private WebElement createlogo ;
	public WebElement createElementlogo()
	{
		return createlogo;
	}
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement adduserbutton;
	public WebElement adduserbuttonlogo()
	{
		return adduserbutton;
	}
	private  WebElement firstName;
	public WebElement addUserfirstname()
	{
		return firstName;
	}
	private  WebElement lastName;
	public WebElement addUserlastname()
	{
		return lastName;
	}
	private  WebElement email;
	public WebElement addUseremail()
	{
		return email;
	}
	private  WebElement userDataLightBox_usernameField;
	public WebElement addUserUsername()
	{
		return userDataLightBox_usernameField;
	}
	private  WebElement password;
	public WebElement addUserpassword()
	{
		return password;
	}
	private  WebElement passwordCopy;
	public WebElement addUserRepassword()
	{
		return passwordCopy;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement createUserButton;
	public WebElement createUserButtonlogo()
	{
		return createUserButton;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")
	//*[@id="userListTableContainer"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]
	private WebElement deleteUser;
	public WebElement deleteUser()
	{
		return deleteUser;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement deleteUser2;
	public WebElement deleteUser2()
	{
		return deleteUser2;
	}
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table")
	private WebElement deleteUser3;
	public WebElement deleteUser3()
	{
		return deleteUser3;
	}
	private  WebElement userDataLightBox_deleteBtn;
	public WebElement deleteUserButton()
	{
		return userDataLightBox_deleteBtn;
	}
	private  WebElement userDataLightBox_commitBtn;
	public WebElement modifyUserButton()
	{
		return userDataLightBox_commitBtn;
	}
	@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
	private WebElement startActiTime;
	public WebElement startActiTimeLink()
	{
		return startActiTime;
	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
	private WebElement createCustomer;
	public WebElement taskButton()
	{
	return createCustomer;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")
	private WebElement addButton;
	public WebElement addButtonClick()
	{
		return addButton;
	}
	@FindBy(xpath="/html/body/div[12]/div[1]")
	private WebElement CreateCustomer;
	public WebElement createCustomerClick()
	{
		return CreateCustomer;
	}
	private WebElement customerLightBox_nameField;
	public WebElement createCustomerTextField()
	{
		return customerLightBox_nameField;
	}
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
	private WebElement createEnter;
	public WebElement createEnterClick()
	{
		return createEnter;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[4]/div[4]")
	private WebElement deleteC3;
	public WebElement deleteC3Customer()
	{
		return deleteC3;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[4]")
	private WebElement deleteC2;
	public WebElement deleteC2Customer()
	{
		return deleteC2;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement deleteC1;
	public WebElement deleteC1Customer()
	{
		return deleteC1;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement actionButton;
	public WebElement actionButtonClick()
	{
		return actionButton;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private  WebElement deleteButton;
	public  WebElement deleteButtonClick()
	{
		return deleteButton;
	}
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement deletePernatelyButton()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
}
