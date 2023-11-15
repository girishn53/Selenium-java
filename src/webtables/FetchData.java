//This program will fetch data from given row and column
package webtables;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchData {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(fetchDataFromRowCell(1, 3));
	
		
	}

	public static String fetchDataFromRowCell(int row, int col) {

		String data = driver
				.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + (row + 1) + "]/td[" + (col + 1) + "]"))
				.getText();

		return data;
	}

}
