package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\"
				+ "seleniumtesting\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		WebElement emailbox = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
		emailbox.sendKeys("ajithkumarak098@gmail.com");
		WebElement passwordbox = driver.findElement(By.xpath("//*[@type='password']"));
		passwordbox.sendKeys("@jithkumar1998J"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement Mobiles = driver.findElement(By.xpath("//*[text()='Mobiles'][1]"));
		 Mobiles.click();
			Thread.sleep(3000);

		 WebElement downlogo = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]/img[2]"));
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", downlogo);
		
	}

}
