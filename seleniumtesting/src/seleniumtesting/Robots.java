package seleniumtesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robots {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\"
				+ "seleniumtesting\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/selenium-tutorials");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Selenium = driver.findElement(By.xpath("//header/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]"));
		Selenium.click();
		//		WebElement sjava = driver.findElement(By.linkText("Selenium with Java"));
		//		sjava.click();
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		//			r.keyPress(KeyEvent.VK_DOWN);
		//			r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		WebElement tag = driver.findElement(By.xpath("//body/div[3]/div[1]/section[1]/article[3]/footer[1]/div[1]/div[1]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", tag );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement img = driver.findElement(By.xpath("//h2[contains(text(),'Free selenium tutorials')]"));
		JavascriptExecutor jss=(JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView()", img );
		System.out.println(" Task Completed ");
		driver.quit();


		//		WebElement Gmail = driver.findElement(By.xpath("(//*[@title='Close'])[2]"));
		//		Gmail.click();
		//		Actions ac =new Actions(driver);
		//		ac.contextClick(Gmail).perform();

		//		r.keyPress(KeyEvent.VK_DOWN);
		//		r.keyRelease(KeyEvent.VK_DOWN);
		//		r.keyPress(KeyEvent.VK_DOWN);
		//		r.keyRelease(KeyEvent.VK_DOWN);
		//		r.keyPress(KeyEvent.VK_DOWN);
		//		r.keyRelease(KeyEvent.VK_DOWN);
		//		r.keyPress(KeyEvent.VK_DOWN);
		//		r.keyRelease(KeyEvent.VK_DOWN);
		//	
	}

}
