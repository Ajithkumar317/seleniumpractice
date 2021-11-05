package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\seleniumtesting\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement simple = driver.findElement(By.xpath("//button[contains(text(),'alert box:')]"));
		simple.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebElement confirm = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]"));

		confirm.click();
		WebElement confirmm = driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]"));

		confirmm.click();
		Thread.sleep(3000);

		driver.switchTo().alert().dismiss();
		WebElement prompt = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));

		prompt.click();
		WebElement promptt = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]"));

		promptt.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Automation Demo site");
		driver.switchTo().alert().accept();
		driver.quit();



	}

}
