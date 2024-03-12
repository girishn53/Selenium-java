//Definition
//Ensure a class only has one instance and provide a global point of access to it.
//Create a private static variable
//Create a private constructor
//Create a public method to access  object

package SingletonConcepts;

import org.openqa.selenium.WebDriver;

public class Driver {
	
	// ThreadLocal used to manage the driver
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    //private constructor
    
    private Driver() {}
    
    public static WebDriver getInstace() {
    	
    	
    	if(driver.get()==null)
    	{
    		WebdriverManager.chromeDriver().setup();
    		driver.set(new ChromeDriver())
    	}
    	return driver.get();
    
    }

}
