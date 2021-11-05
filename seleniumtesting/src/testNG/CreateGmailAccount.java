package testNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.Test;

public class  CreateGmailAccount  {
	@Test

	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\seleniumtesting\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver,  Registraionpageobjects.class)	;
		
		
    	Registraionpageobjects.tab.click();
    	Set<String> handles = driver.getWindowHandles();
		for (String string : handles) {
			driver.switchTo().window(string);
		}
		Registraionpageobjects.Fname.sendKeys("Ajith");
		Registraionpageobjects.Lname.sendKeys("kumar");
		Registraionpageobjects.Username.sendKeys("AJITHKUMARSUBRAMANYAM");
		Registraionpageobjects.createpassword.sendKeys("@jithkumar1998J");
		Registraionpageobjects.confirmpassword.sendKeys("@jithkumar1998J");
		Registraionpageobjects.showpasswordbox.click();
		Registraionpageobjects.nextbutton.click();
		
//		driver.close();
//		driver.getWindowHandle();
//		PageFactory.initElements(driver,  LoginGmail.class)	;
//		LoginGmail.signin.click();
//		LoginGmail.emailbox.sendKeys("ajithkumar3171998");
//		LoginGmail.next.click();
//		LoginGmail.password.sendKeys("@jith1998J");
//		LoginGmail.next2.click();
//		
		

	}

}
