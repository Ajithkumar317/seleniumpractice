package testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Dependencies {
	WebDriver driver;
	long start;
	long end;
	@BeforeSuite
	private void Browserlaunch() {
		long start=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\git\\\\repository\\\\seleniumtesting\\\\Driver\\\\chromedriver.exe");
		driver=new ChromeDriver();}

	@Test		
	public void facebook(){

		driver.get("https://www.facebook.com/");


	}
	@Test(dependsOnMethods = "whatsapp")
	public void inst() {

		driver.get("https://www.instagram.com/");

	}
	@Test(dependsOnMethods = "facebook")

	public void amazon() {
		driver.get("https://www.amazon.in/");


	}
	@Test(dependsOnMethods = "amazon")

	public void whatsapp() {


		driver.get("https://www.whatsapp.com/");


	}
	@AfterSuite
	private void publi() {
		driver.close();
		long end=	System.currentTimeMillis();
		long total=end-start;
		System.out.println("totaltime taken "+total);

	}

}



