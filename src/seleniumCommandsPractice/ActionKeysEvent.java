package seleniumCommandsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeysEvent {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement searchBox = driver.findElement(By.name("q"));

		Actions act = new Actions(driver);
		
		// below code sends the text in upper case to google search box
	
		act.keyDown(searchBox, Keys.SHIFT).sendKeys("Hi Girish Signing in").keyUp(Keys.SHIFT);
		
		act.build().perform();
	}
}