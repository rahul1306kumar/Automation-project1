package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	public WebDriver ldriver;
	
	public loginpage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	
	
	public void setUserName(String uname) {
		
		txtUserName.sendKeys(uname);
		
		
	}
	
	public void setpassword(String pwd) {
		
		txtPassword.sendKeys(pwd);
		
	}
	
	public void btnlogin() {
		
		btnLogin.click();
		
	}
	
	
	

}
