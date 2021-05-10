package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Driver {

	
private static WebDriver driver=null;
	
	
	public static WebDriver getDriver() {
		
	
	if(driver== null)
		
		switch ("chrome") {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		
		}return driver;
		
	}
	
	public static void closeBrowserSession() {
		
		driver.close();
		driver.quit();
		driver=null;
	}
	
	
	
	
}
