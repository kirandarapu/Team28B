package Luma_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Luma_PageObjects.LoginPage;
import Luma_PageObjects.Luma_HomePage;

public class TC_002_Luma_SignIN extends Luma_BaseClass {
	
	@Test
	public void LoginTest() {
		
		Luma_HomePage lhp=new Luma_HomePage(driver);
		
		lhp.clickSigninlnk();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(EmailAdd);
		lp.setPassword(Pword);
		lp.clickLoginBtn();
		
		String Act_title=driver.getTitle();
		String Exp_title="My Account11";
		
		if(Act_title.equals(Exp_title)) {
			
			Assert.assertTrue(true);//hard assert
			System.out.println("Testcase is Passed");
		}else
		{
			Assert.assertTrue(false);
			System.out.println("Testcase is failed");
		}
	}
}
