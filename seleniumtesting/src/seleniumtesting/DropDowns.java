package seleniumtesting;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\repository\\seleniumtesting\\Driver");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement Index = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select Selects=new 	Select(Index);
		 boolean multiple = Selects.isMultiple();
		 System.out.println(multiple);


		Selects.selectByIndex(2);
		/*
		 * WebElement value = driver.findElement(By.xpath(
		 * "//body[1]/div[1]/div[1]/div[3]/section[1]/div[2]/select[1]")); Select
		 * values=new Select( value); values.selectByValue("4	");
		 */
		
		WebElement options = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[4]/select[1]"));
		Select obj=new Select(options);
		 boolean list = obj.isMultiple();
		 System.out.println( list );
		List <WebElement>listofoptions=obj.getOptions();
		for (WebElement webElement : listofoptions) {
			String text = webElement.getText();
			System.out.println(text);
			
			
		}
		int size=listofoptions.size();
		System.out.println("No .of elements:"+ size);

	}

}
