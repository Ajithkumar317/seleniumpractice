package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\repository\\seleniumtesting\\Driver");
		WebDriver driver=new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");



		WebElement position = driver.findElement(By.xpath("//button[@id='position']"));
		Point valuespoint=position.getLocation(); 
		int x=valuespoint.getX(); 
		int y=valuespoint.getY();
		System.out.println("X value is :"+ x +"Y value is:" +y);
		WebElement colour = driver.findElement(By.xpath("//button[@id='color']"));
		String color=colour.getCssValue("background-color");
		System.out.println(color);
		WebElement size = driver.findElement(By.xpath("//button[@id='size']"));
		int H =size.getSize().getHeight();
		int W =size.getSize().getWidth();
		System.out.println(" height is:"+ H + " Width is :"+ W);

		WebElement Button = driver.findElement(By.xpath("//button[@id='home']"));

		Button.click();
		driver.quit();

	}

}
