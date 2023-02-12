package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig {
	
	Properties pro;
	
	public readconfig() {
		
		File src=new File("./configuration/config.properties");
		
		
		try {
			
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
			
		}catch (Exception e) {
			System.out.println("exception is:"+e.getMessage());
		}
	}
	
	public String getapplicationurl() {
		
		String url=pro.getProperty("baseurl");
		return url;
		
	}
	
	public String getusername() {
		
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getpassword() {
		
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getchromepath() {
		
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
public String getiepath() {
		
		String iepath=pro.getProperty("iepath");
		return iepath;
	}

public String getfirefoxpath() {
	
	String firefoxpath=pro.getProperty("firefox");
	return firefoxpath;
}

}
