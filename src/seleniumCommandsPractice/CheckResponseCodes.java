package seleniumCommandsPractice;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckResponseCodes {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://edition.cnn.com/");

		List<WebElement> topElements = driver.findElements(By.xpath("//ul[@class='sc-cSHVUG bYPcOh']/li/a"));

		for (int i = 0; i < topElements.size(); i++) {
			System.out.println(topElements.get(i).getText());
			System.out.println(topElements.get(i).getAttribute("href"));

		}

		
	}

}