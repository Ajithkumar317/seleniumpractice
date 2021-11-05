package testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class Registraionpageobjects {
	@FindBy(xpath   = "//a[contains(text(),'Create an account')]")
	public static WebElement tab;
	
	
	
	
	@FindBy(xpath =  "//input[@id='firstName'] ")
    public static WebElement Fname;
	
	
	
	@FindBy(xpath =   "//input[@id='lastName'] ")
	public static WebElement Lname;
	
	
	
	@FindBy(xpath =   "//input[@id='username']")
    public static WebElement Username;
	
	@FindBy(xpath =   "//*[@type='password']")
    public static WebElement createpassword;
	
	@FindBy(xpath =   "(//*[@type='password'])[2]")
    public static WebElement confirmpassword;
	
	@FindBy(xpath =   "//input[@id='i3']")
    public static WebElement showpasswordbox;
	
	
	@FindBy(xpath =   "//span[contains(text(),'Next')]")
    public static WebElement nextbutton;
	
	
	
	
	


	

}
