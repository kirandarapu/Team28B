package Luma_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Luma_Base {
	
	//create the constructor
	//same name as classname
	public static WebDriver driver;
	public Luma_Base(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
