package Luma_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends Luma_Base {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="email")
	WebElement txt_EmailAdd;

	@FindBy(id="pass")
	WebElement txt_PassWord;

	@FindBy(xpath="(//button[@id='send2']/span)[1]")
	WebElement btn_Login;

	public void setEmail(String EMail) {
		txt_EmailAdd.sendKeys(EMail);
		
	}
	public void setPassword(String Pass) {
		txt_PassWord.sendKeys(Pass);
		
	}

	public void clickLoginBtn()
	{
		btn_Login.click();
		
	}

}