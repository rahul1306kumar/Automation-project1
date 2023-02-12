package com.inerbanking.testcases;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.Reporting3;
import com.inetbanking.utilities.readconfig;

public class baseclass {
	
	
	
	readconfig rg=new readconfig();
	
	public String baseurl=rg.getapplicationurl();
	public String username=rg.getusername();
	public String password=rg.getpassword();
	
	
	public static WebDriver driver;
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		
		if(br.equals("chrome")) {
		System.setProperty("WebDriver.chrome.driver",rg.getchromepath());
		driver=new ChromeDriver();
		
		}
		
		else if(br.equals("firefox")) {
			System.setProperty("WebDriver.gecko.driver",rg.getfirefoxpath());
			driver=new FirefoxDriver();
			
		}
		
		else if(br.equals("ie")) {
			System.setProperty("WebDriver.ie.driver",rg.getiepath());
			driver=new InternetExplorerDriver();
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	public static void getscreenshot(String tname) {
		
		
       File srcscreenshot=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String destinationscreenshotpath=System.getProperty("user.dir")+"\\screenshots\\"+tname+".png";
		try {
			FileHandler.copy(srcscreenshot, new File(destinationscreenshotpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	
/*	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
	*/
	
	

}
