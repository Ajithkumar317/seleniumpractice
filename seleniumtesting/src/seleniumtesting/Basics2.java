package seleniumtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\repository\\seleniumtesting\\Driver");
WebDriver driver=new ChromeDriver();

driver.get("https://www.amazon.in/");
//Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Hello, Sign in']")).click();
//driver.findElement(By.id("identifierId")).sendKeys("ajithkumarak098"+Keys.ENTER);
//WebElement findElement = driver.findElement(null);
driver.findElement(By.xpath("//*[@type='email']")).sendKeys("7780318375"+Keys.ENTER);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.findElement(By.id("ap_password")).sendKeys("@jithkumar1998J");
driver.findElement(By.xpath("//*[@TYPE='submit']")).click();
//


// driver.findElementdri /html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input
// driver.findElement(By.id("lastName")).sendKeys("kumar");
// driver.findElement(By.id("username")).sendKeys("ajithkumar1998");
// driver.findElement(By.className("Passwd")).sendKeys("@jith1998J");
// driver.findElement(By.className("ConfirmPasswd")).sendKeys("@jith1998J");




//driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("7729850780");
//WebElement emailbox=driver.findElement(By.id("createAccountSubmit"));
//emailbox.click();//.sendKeys("@jithkumar1998J"+Keys.ENTER);


//driver.close();



	}

}
