package Luma_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class CreateAccountPage extends Luma_Base {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	//identify the elements
	
	@FindBy(id="firstname")
	WebElement txt_FirstName;
	
	@FindBy(id="lastname")
	WebElement txt_LastName;
	
	@FindBy(id="email_address")
	WebElement txt_Email;
	
	@FindBy(id="password")
	WebElement txt_Password;
	
	@FindBy(id="password-confirmation")
	WebElement txt_Cpassword;
	
	@FindBy(xpath="//button[@type='submit']/span[text()='Create an Account']")
	WebElement btn_CreateAcc;
	
	
	public void CreateAccountFunctionality() {
		
		txt_FirstName.sendKeys("Ravikumar");
		
		txt_LastName.sendKeys("yalla");
		
		txt_Email.sendKeys("abcd2747@gmail.com");
		
		txt_Password.sendKeys("Ravi@2747");
		
		txt_Cpassword.sendKeys("Ravi@2747");
		
		btn_CreateAcc.click();
		
		
	}
	
	

}
