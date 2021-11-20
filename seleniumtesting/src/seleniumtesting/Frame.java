package seleniumtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\repository\\seleniumtesting\\Driver");
		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		driver.manage().window().maximize();
	WebElement tframe = driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
	tframe.click();
//		driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		driver.switchTo().frame(2);
//		driver.switchTo().frame(3);
//		driver.switchTo().frame(4);
//		driver.switchTo().frame(5);
//
////	driver.switchTo().frame(2);

		WebElement inframe = driver.findElement(By.xpath("http://demo.automationtesting.in/Frames.html"));
		 inframe.click();
		  String text = driver.findElement(By.xpath("http://demo.automationtesting.in/Frames.html")).getText();
		  System.out.println(text);
//		WebElement sframe = driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]"));
//		sframe.click();
//		driver.switchTo().frame(0);
		
	}

}
