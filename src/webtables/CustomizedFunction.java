//Function in this program will get the row in which data is present else it will give -1

package webtables;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedFunction {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\browserdrivers\\chromedriver_win32 (5)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	int r=	getRowNumWithCellData("1,303223032088.00");
	
	System.out.println("---row Num is" +r);

	
	}

	public static int getRowNumWithCellData(String data) {

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

		for (int i = 0; i < rows.size(); i++) {
			
			WebElement row=rows.get(i);

			List<WebElement> cells = row.findElements(By.tagName("td"));

			for (int j = 0; j < cells.size(); j++) {
				
				
				if (data.equalsIgnoreCase(cells.get(j).getText())) {
					
					return (i+1);
					
					
					

				}
				
			
				}
		
			
		}
		return -1;

	}

}
