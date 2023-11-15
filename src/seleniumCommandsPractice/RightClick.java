//This program right clicks on a webelement
package seleniumCommandsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Actions act=new Actions(driver);
		
		WebElement e1=driver.findElement(By.id("rightClickBtn"));
		
		act.contextClick(e1)
		.build()
		.perform();
		}
}