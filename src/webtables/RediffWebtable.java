//This program will search for the company name and find the price against that company name 

package webtables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffWebtable {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String company = "REC";

		String xpath = "//table[@class='dataTable']/tbody/tr/td[1]";
		List<WebElement> companyNames = driver.findElements(By.xpath(xpath));

		for (int i = 0; i < companyNames.size(); i++) {
			if (company.equalsIgnoreCase(companyNames.get(i).getText())) {

				i=i+1;
				String price = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + i + "]/td[4]"))
						.getText();

				System.out.println("Company " + company + " currentPrice is " + price);
				break;
			}

		}

	}

}
