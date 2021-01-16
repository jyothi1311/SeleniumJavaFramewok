import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTest {
	
	public static void main(String[] args) {
	
		
		
		
		//System.setProperty("webdriver.gecko.driver", "F:/JavaProjects/SeleniumJavaFramework/drivers/geckodriver/geckodriver.exe");
	
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://facebook.com");
		
		System.setProperty("webdriver.chrome.driver", "F:/JavaProjects/SeleniumJavaFramework/drivers/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
		
        
		//System.setProperty("webdriver.ie.driver", "F:/JavaProjects/SeleniumJavaFramework/drivers/IEdriver/IEDriverServer.exe");
		
		//WebDriver driver = new InternetExplorerDriver();
		//driver.get("https://google.com");
		
		
	}

}
