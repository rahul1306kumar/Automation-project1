package com.inerbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.loginpage;
import com.inetbanking.utilities.gettestdatafromexcel;

public class TC_LoginTest_001 extends baseclass {
	
	
	
	@Test
	public void logintest() {
		
		driver.get(baseurl);
		
		
		
		loginpage lp=new loginpage(driver);
		
		lp.setUserName(username);
		lp.setpassword(password);
		lp.btnlogin();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
		}
		
		
		else {
			
			Assert.assertTrue(false);
		}
		
	}
	
	
	
	
	
	
	
	

}
