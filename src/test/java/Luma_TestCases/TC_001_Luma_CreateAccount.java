package Luma_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Luma_PageObjects.CreateAccountPage;
import Luma_PageObjects.Luma_HomePage;

public class TC_001_Luma_CreateAccount extends Luma_BaseClass {

	@Test
	public void CreateAcTest() {
		
		Luma_HomePage lhp=new Luma_HomePage(driver);
		
		lhp.clickCreateAcclnk();
		log.info("link clicking activityis completed");
		
		CreateAccountPage lcp=new CreateAccountPage(driver);
		 lcp.CreateAccountFunctionality();
		 
		 String Act_Title=driver.getTitle();
		 String Exp_Title="My Account";
		 
		 if(Act_Title.equals(Exp_Title)) {
			 
			 Assert.assertTrue(true);
			 log.info("testcase passed");
		 }else
		 {
			 captureScreen("CreateAcTest");
			 log.info("Testcase is failed");
			 
		 }
		 
		 log.info("account created");
	}
	
}
