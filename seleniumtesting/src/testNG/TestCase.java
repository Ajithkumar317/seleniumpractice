package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase {
	WebDriver driver;
	long start;
	long end;
	@BeforeSuite
	public void launch() {
		long start=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\repository\\seleniumtesting\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();}



	@Test
	public void openGoogle() {

		driver.get("https://www.google.com/");
        }
	@Test(priority = -3)
	public void faceook(){

		driver.get("https://www.facebook.com/");
}
	@Test(priority = 3)
	public void inst() {

		driver.get("https://www.instagram.com/");
}
	@AfterSuite
	public void closebrowser() {
		driver.close();
		long end=	System.currentTimeMillis();
		long total=end-start;
		System.out.println("totaltime taken "+total);

	}
}
