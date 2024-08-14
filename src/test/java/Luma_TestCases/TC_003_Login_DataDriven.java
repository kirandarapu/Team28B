package Luma_TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Luma_PageObjects.LoginPage;
import Luma_PageObjects.Luma_HomePage;
import Luma_Utilities.ExcelRead;

public class TC_003_Login_DataDriven extends Luma_BaseClass {

	
	@Test(dataProvider="LoginData11")
	public void LoginTest_DataDriven(String EM,String pw)//any type data should be accepted
	{
		
		Luma_HomePage lhp=new Luma_HomePage(driver);
		lhp.clickSigninlnk();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(EM);
		lp.setPassword(pw);
		lp.clickLoginBtn();
	}
	
	@DataProvider(name="LoginData11")
	 String[][] getData() throws IOException {
		
		String path="C:\\Kiran\\AlterShop Workspace\\LumaProject002\\TestData\\LoginData11.xlsx";
	    int rownum=ExcelRead.getRowCount(path, "Sheet1");
	    int cellcount=ExcelRead.getCellcount(path, "Sheet1", 1);
	    
	    String logindata[][]=new String [rownum][cellcount];
	
	    for(int i=1;i<rownum;i++) {//it is represents rows
	    	
	    	for(int j=0;j<cellcount;j++) {//it is represents the cell 
	    		
	    		
	    		logindata[i][j]=ExcelRead.getCelldata(path, "Sheet1", i, j);
	    	}
	    }
	    
	    return logindata;
	}
	
}
