package Luma_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class Reading {
	
	Properties pro;
	public Reading(){
		
		File f=new File("C:\\Kiran\\AlterShop Workspace\\LumaProject002\\Configuration\\config.properties");
		//it is coverted into reading mode
	
		try {
		FileInputStream fis=new FileInputStream(f);
		pro=new Properties();
		pro.load(fis);
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
		
		public String getApplicationurl() {
			
			String URL=pro.getProperty("baseURL");
			return URL;
			
		}
		
		public String getEmail() {
			String email=pro.getProperty("Email");
			return email;
		}
		
		public String getPassword() {
			String pWord=pro.getProperty("password");
			return pWord;
		}

}
