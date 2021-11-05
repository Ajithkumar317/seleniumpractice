package testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginGmail {
	
	
	
	@FindBy(xpath =    "//a[contains(text(),'Sign in')]")
    public static WebElement signin;
	
	
	
	@FindBy(xpath =   "//input[@id='identifierId']")
	public static WebElement emailbox;
	
	
	
	@FindBy(xpath =   "(//*[@jsname='V67aGc'])[2]")
    public static WebElement next;
	
	@FindBy(xpath =   "(//*[@type='password'])[1]")
    public static WebElement password;
	
	@FindBy(xpath =   "(//*[@class='VfPpkd-vQzf8d'])[1]")
    public static WebElement next2;
	

}
