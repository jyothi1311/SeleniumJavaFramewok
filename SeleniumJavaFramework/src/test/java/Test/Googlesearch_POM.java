package Test;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class Googlesearch_POM {
	
	static WebDriver driver=null;
	public static void main(String[] args) {
		
		googlesearch();
		
	}
	
	public static void googlesearch()
	{
        System.setProperty("webdriver.chrome.driver", "F:/JavaProjects/SeleniumJavaFramework/drivers/chromedriver/chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		//goto google
		driver.get("https://google.com");
		//Enter text in text box
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		//Click on google search button
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.Button_search(driver).sendKeys(Keys.RETURN);;
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
