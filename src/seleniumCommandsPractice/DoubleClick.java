package seleniumCommandsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement Btn_doubleClick =driver.findElement(By.id("doubleClickBtn"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(Btn_doubleClick).build().perform();
		
	}

}
