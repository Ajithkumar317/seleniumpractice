package automationPractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Task1 {

	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\User\\git\\repository\\seleniumtesting\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		signin.click();
		WebElement emailbox = driver.findElement(By.xpath("//input[@id='email']"));
		emailbox.sendKeys("ajithkumarak098@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//input[@id='passwd']"));
		Password.sendKeys("@jithkumar1998J" + Keys.ENTER);
		
		
		
		
		Actions mousehover=new Actions(driver);
		WebElement wm = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]"));
		WebElement ts = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/"
				+ "ul[1]/li[1]/ul[1]/li[1]/a[1]"));
		mousehover.moveToElement(wm).build().perform();
		mousehover.moveToElement(ts).click().build().perform();
		WebElement top = driver.findElement(By.xpath("//img[@height='250']"));
		top.click();
		Thread.sleep(3000);

		WebElement Addtocart = driver.findElement(By.xpath("//*[contains(text(),'Add to cart')]"));
		Addtocart.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement proceed = driver.findElement(By.xpath("//*[@title='Proceed to checkout']"));
		proceed.click();
		WebElement proceed2 = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]/i[1]"));
		proceed2.click();
		WebElement proceedC = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/"
				+ "form[1]/p[1]/button[1]/span[1] "));
		proceedC.click();
		WebElement Tc = driver.findElement(By.id("cgv"));
		Tc.click();
		WebElement proceedD = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/"
				+ "div[1]/form[1]/p[1]/button[1]/span[1]"));
		proceedD.click();
		WebElement payment = driver.findElement(By.xpath("//*[@class=\"cheque\"]"));
		payment.click();
		WebElement confirm = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]"));
		confirm.click();
		TakesScreenshot screen =(TakesScreenshot) driver;
		File srfile = screen.getScreenshotAs(OutputType.FILE);
		File dsfile=new File("C:\\Users\\User\\git\\repository\\seleniumtesting\\Screenshot\\img.png");
		FileUtils.copyFile(srfile, dsfile);
		
		Thread.sleep(3000);
		driver.close();
		System.out.println(" Order Placed ");




	}

}
