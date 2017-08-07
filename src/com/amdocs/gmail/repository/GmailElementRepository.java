package com.amdocs.gmail.repository;

public interface GmailElementRepository
{
	String Website_URL="http://www.gmail.com";
	String R_Btn_SignIn="//a[text()='Sign In']";
	String R_Btn_CreateAnAccount="//a[text()='Create an account']";
	String R_Tb_FirstName="//input[@id='FirstName']";
	String R_Tb_LastName="//input[@id='LastName']";
	String R_Tb_UserName="//input[@id='GmailAddress']";
	String R_Tb_Pwd="//input[@id='Passwd']";
	String R_Tb_PwdConfirm="//input[@id='PasswdAgain']";
	String R_Dd_Month="//div[@title='Birthday']";
	String R_Tb_Day="//input[@id='BirthDay']";
	String R_Tb_Year="//input[@id='BirthYear']";
	String R_Dd_Gender="//div[text()='I am...']";
	String R_Tb_Phone="//input[@id='RecoveryPhoneNumber']";
	String R_Tb_RecoveryEmail="//input[@id='RecoveryEmailAddress']";
	String R_Dd_Country="(//div[@class='goog-inline-block goog-flat-menu-button-caption'])[3]";
	String R_Btn_NextStep="//input[id='submitbutton']";
	
	String LI_Tb_Email="//input[@id='identifierId']";
	String LI_Btn_Next="//span[text()='Next']";
	String LI_Tb_Pwd="//input[@name='password']";
	String LI_Btn_NextPwd="//*[@id='passwordNext']/content/span";
	
	String LO_Btn_ProfilePic="//a[@href='https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail&service=mail']";
	//String LO_Btn_ProfilePic= "//a[contains(@title,'piu.priyanka05@gmail.com')]";
	String LO_Btn_SignOut="//a[text()='Sign out']";
	
	void func_Registration(String Input_FirstName, String Input_LastName, String Input_UserName, String Input_Pwd, String Input_PwdCondfirm, String Input_BirthMonth, String Input_BirthDay, String Input_BirthYear, String Input_Gender, String Input_Phone, String Input_RecoveryEmail, String Input_Country);
	
	void func_Login(String Input_UserName, String Input_Pwd);
	
	void func_Logout();

}
