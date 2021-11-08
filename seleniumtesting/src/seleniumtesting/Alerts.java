package seleniumtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class Alerts {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\repository\\seleniumtesting\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.MILLISECONDS);
		WebElement simple = driver.findElement(By.xpath("//button[contains(text(),'alert box:')]"));
		simple.click();
		driver.switchTo().alert().dismiss();
		WebElement confirm = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]"));

		confirm.click();
		WebElement confirmm = driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]"));

		confirmm.click();

		driver.switchTo().alert().dismiss();
		WebElement prompt = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
		

		prompt.click();

		WebElement promptt = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]"));

		promptt.click();
	driver.switchTo().alert().sendKeys("Automation Demo site");
		String text = driver.switchTo().alert().getText();



		driver.switchTo().alert().accept();
		System.out.println( text);




	}

}
