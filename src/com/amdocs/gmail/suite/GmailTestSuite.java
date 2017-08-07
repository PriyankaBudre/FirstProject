package com.amdocs.gmail.suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amdocs.gmail.pom.GmailPerformingAction;


public class GmailTestSuite 
{
	GmailPerformingAction perfomingAction;
	
	public  WebDriver driver1;
	
	
	@BeforeSuite
	
	public void beforeSuite()
	{
		System.setProperty("webdriver.chrome.dirver", ".\\chromedriver");
		driver1 = new ChromeDriver();
		
		driver1.get("https://www.google.com/gmail/about/#");
				
		//driver1.get("https://accounts.google.com/SignUp?hl=en");
		driver1.manage().window().maximize();
		perfomingAction=new GmailPerformingAction(driver1);
	}
	 

	@Parameters({"Input_FirstName","Input_LastName", "Input_UserName", "Input_Pwd", "Input_PwdCondfirm", "Input_BirthMonth", "Input_BirthDay", "Input_BirthYear", "Input_Gender", "Input_Phone", "Input_RecoveryEmail", "Input_Country"})
	
	
	/*
	public void test(String Input_FirstName,String Input_LastName,String Input_UserName, String Input_Pwd, String Input_PwdCondfirm, String Input_BirthMonth, String Input_BirthDay, String Input_BirthYear, String Input_Gender, String Input_Phone,String Input_RecoveryEmail, String Input_Country)
	{		
		//Explicit wait will wait until the specified condition is met
		
		System.out.println(Input_FirstName);
		
		//perfomingAction.func_Registration(Input_FirstName, Input_LastName, Input_UserName, Input_Pwd, Input_PwdCondfirm, Input_BirthMonth, Input_BirthDay, Input_BirthYear, Input_Gender, Input_Phone, Input_RecoveryEmail, Input_Country);
		
		perfomingAction.func_Login(Input_UserName, Input_Pwd);
		
		perfomingAction.func_Logout();		
	}
*/	
	@Test (priority=1)
	public void loginInvalidUsername(String Input_UserName, String Input_Pwd)
	{
		perfomingAction.func_Login(Input_UserName, Input_Pwd);
	}
	
	@Test (priority=2)
	public void loginInvalidPassword(String Input_UserName, String Input_Pwd)
	{
		perfomingAction.func_Login(Input_UserName, Input_Pwd);
	}
	
	@Test (priority=3)
	public void loginInvalidUsrPwd(String Input_UserName, String Input_Pwd)
	{
		perfomingAction.func_Login(Input_UserName, Input_Pwd);
	}
	
}
