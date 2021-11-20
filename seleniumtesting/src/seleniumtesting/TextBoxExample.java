package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\repository\\seleniumtesting\\Driver");
		WebDriver driver=new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");

		WebElement send = driver.findElement(By.xpath("//input[@id='email']"));
		send.sendKeys("Ajith kumar");
		WebElement append = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/section[1]/div[2]/div[1]/div[1]/input[1]"));
		append.sendKeys("Bangalore");
		WebElement gettext = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/section[1]/div[3]/div[1]/div[1]/input[1]"));
		String value=	 gettext.getAttribute("value");
		System.out.println(value);
		WebElement clear = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/section[1]/div[4]/div[1]/div[1]/input[1]"));
		clear.clear();
		WebElement check = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/section[1]/div[5]/div[1]/div[1]/input[1]"));
		boolean  Status=check.isEnabled();
		System.out.println(Status);
	}
}
