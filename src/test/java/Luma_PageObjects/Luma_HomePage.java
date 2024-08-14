package Luma_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Luma_HomePage extends Luma_Base {

	
	//it is devided into 3 parts
	//1.constructor  2.element identification  3.create actions 
	public Luma_HomePage(WebDriver driver){
		super(driver);
	}
	
	//element identification
	
	@FindBy(xpath="(//a[text()='Create an Account'])[1]")
	WebElement lnkCreateAcc;
	
	@FindBy(xpath="(//li[@class='authorization-link']/a)[1]")
	WebElement lnk_Sigin;
	
	
	//create the actions
	
	public void clickCreateAcclnk() {
		 lnkCreateAcc.click();	
	}
	
	public void clickSigninlnk() {
		lnk_Sigin.click();
	}
	
	
}
