package seleniumCommandsPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/guru99home/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		List frames = driver.findElements(By.tagName("iframe"));

		System.out.println("Total number of frames are " + frames.size());

		// switching to first frame

		driver.switchTo().frame("a077aa5e");
		
		

		driver.findElement(By.xpath("//a/img[@src='Jmeter720.png']")).click();

	}
}