package seleniumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\repository\\seleniumtesting\\Driver");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> Table = driver.findElements(By.xpath("//*[@id='customers']"
				+ "//tbody//tr//td"));
		int totaldata= Table.size();
			List<WebElement> TH = driver.findElements(By.xpath("//*[@id='customers']//tbody//th"));
			int row= TH.size();
			int TD=totaldata+row;
		System.out.println("Total data in the table "
				+ "Including table Head is "+ TD);
		//		
		//		int totaltd=column* row;
		//		System.out.println("Total no oftable data is :"+totaltd);

	}

}
