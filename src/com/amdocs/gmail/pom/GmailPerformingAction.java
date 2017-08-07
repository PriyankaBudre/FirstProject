package com.amdocs.gmail.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.amdocs.gmail.repository.GmailElementRepository;
import com.amdocs.gmail.suite.GmailTestSuite;

public class GmailPerformingAction implements GmailElementRepository
{
	WebDriver driver;
	
	public GmailPerformingAction(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void func_Registration(String input_FirstName, String input_LastName, String input_UserName, String input_Pwd, String input_PwdCondfirm, String input_BirthMonth, String input_BirthDay, String input_BirthYear, String input_Gender, String input_Phone, String input_RecoveryEmail, String input_Country) 
	{
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//WebDriverWait expwait= new WebDriverWait(driver, 30);
		//expwait.until(ExpectedConditions.elementToBeClickable(By.xpath("R_Btn_CreateAnAccount")));
		
		System.out.println("Waited for30 seconds");
		//driver.findElement(By.xpath("R_Btn_CreateAnAccount")).click();
		//Assert.assertEquals(driver.getTitle(), "Gmail");
		
		driver.findElement(By.xpath(R_Tb_FirstName)).sendKeys(input_FirstName);
		
		driver.findElement(By.xpath(R_Tb_LastName)).sendKeys(input_LastName);
		
		driver.findElement(By.xpath(R_Tb_UserName)).sendKeys(input_UserName);
		
		driver.findElement(By.xpath(R_Tb_Pwd)).sendKeys(input_Pwd);
		
		driver.findElement(By.xpath(R_Tb_PwdConfirm)).sendKeys(input_PwdCondfirm);
		
		//driver.findElement(By.xpath(R_Dd_Month)).click();
		
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//span[@id='BirthMonth']/div[2]/*//div[text()="+input_BirthMonth+"])")).click();
		//driver.findElement(By.xpath("//span[@id='BirthMonth']/div[2]/div[@id='6']")).click();
		
		driver.findElement(By.xpath(R_Tb_Day)).sendKeys(input_BirthDay);
		
		driver.findElement(By.xpath(R_Tb_Year)).sendKeys(input_BirthYear);
		
		/*Actions action1= new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath(R_Dd_Gender))).click().build().perform();
		
		driver.findElement(By.xpath(R_Dd_Gender)).click();
		driver.findElement(By.xpath("//div[text()="+input_Gender+"]")).click();
		*/
		
		driver.findElement(By.xpath(R_Tb_Phone)).sendKeys(input_Phone);
		
		driver.findElement(By.xpath(R_Tb_RecoveryEmail)).sendKeys(input_RecoveryEmail);
		
		driver.findElement(By.xpath(R_Dd_Country)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(LI_Btn_NextPwd)).click();	
	}
	
	@Override
	public void func_Login(String input_UserName, String input_Pwd) 
	{
		String assertHomepage= "Gmail - Free Storage and Email from Google";
		Assert.assertEquals(driver.getTitle(), assertHomepage);
		
		driver.findElement(By.xpath(R_Btn_SignIn)).click();
		Assert.assertEquals(driver.getTitle(), "Gmail");
		
		driver.findElement(By.xpath(LI_Tb_Email)).sendKeys(input_UserName);
		driver.findElement(By.xpath(LI_Btn_Next)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(LI_Tb_Pwd)).sendKeys(input_Pwd);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Boolean pr= driver.findElement(By.xpath(LI_Btn_NextPwd)).isDisplayed();
		System.out.println("Next is present: "+pr);
		driver.findElement(By.xpath(LI_Btn_NextPwd)).click();
		
		//Assert.assertEquals(driver.getTitle(), "+input_UserName+");
		
	}

	@Override
	public void func_Logout() 
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Boolean pr2=driver.findElement(By.xpath(LO_Btn_ProfilePic)).isDisplayed();
		System.out.println("Logout is nabled: "+pr2);
		driver.findElement(By.xpath(LO_Btn_ProfilePic)).click();
		driver.findElement(By.xpath(LO_Btn_SignOut)).click();
		
		/*driver.findElement(By.xpath("//span[contains(text(),'Hey')]")).isEnabled();
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hey')]"))).click().build().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement mainMenu = driver.findElement(By.xpath("//span[contains(text(),'Hey')]"));
		action.moveToElement(mainMenu);
		action.click().perform();
				*/
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Assert.assertEquals(driver.getCurrentUrl(), "Gmail");
	}

}

