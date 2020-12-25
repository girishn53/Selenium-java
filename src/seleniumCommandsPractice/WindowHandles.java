
//This program will launch naukri.com  

//and close all the windows except main window and prints the title

package seleniumCommandsPractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");

		
		//It will give parent window
		String baseHandle = driver.getWindowHandle();

		System.out.println("Parent handle is  " + baseHandle);
		
		
		//It returns the ordered set 
		
		Set<String> allHandles = driver.getWindowHandles();

		for (String handle : allHandles) {
			System.out.println(" handles are " + handle);

			if (!(handle.equalsIgnoreCase(baseHandle))) {

				driver.switchTo().window(handle).close();

			}

		}

		driver.switchTo().window(baseHandle);

		System.out.println("The title of the page is " + driver.getTitle());

	}

}
