package com.inerbanking.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.loginpage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends baseclass {
	
	
	@Test(dataProvider="Logindata")
	public void loginDDT(String user,String pwd) {
		driver.get(baseurl);
		
		loginpage lp=new loginpage(driver);
		
		lp.setUserName(user);
		lp.setpassword(pwd);
		lp.btnlogin();
		
	}
	
	@DataProvider(name="Logindata")
	String[][] getdata() throws IOException{
		
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testdata/Logindata.xlsx";
		int rownum=XLUtils.getrowcount(path, "Sheet1");
		int colcount=XLUtils.getcellcount(path, "Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {
			
			for(int j=0;j<colcount;j++) {
				
				logindata[i-1][j]=XLUtils.getcelldata(path,"Sheet1", i, j);
				
			}
			
		}
		
		return logindata;
		
	}
	
	
	
	
	

}
