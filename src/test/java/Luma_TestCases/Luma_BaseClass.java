package Luma_TestCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Luma_Utilities.Reading;

public class Luma_BaseClass {
	public static WebDriver driver;
	public Logger log;
	
	Reading rd=new Reading();
	
	public String AppURL=rd.getApplicationurl();
	public String EmailAdd=rd.getEmail();
	public String Pword=rd.getPassword();
	
	//common functionality for each and every testcases
	
	@BeforeClass
	public void setup() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log=Logger.getLogger(this.getClass());
		PropertyConfigurator.configure("log4j11.properties");
		
		
		driver.get(AppURL);
		driver.manage().window().maximize();
		
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	
	public String captureScreen(String name)  {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		String destination= "C:\\Kiran\\AlterShop Workspace\\LumaProject002\\Screenshots\\"+name+timeStamp+".png";
		
		try {
			FileUtils.copyFile(source, new File(destination));
		}catch(Exception e) {
			e.getMessage();
		}
		return destination;

	}
}
