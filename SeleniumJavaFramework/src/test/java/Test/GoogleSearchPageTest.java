package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver =null;
	public static void main(String[] args) {
		
		GoogleSearchTest();
		
	}
	
	public static void GoogleSearchTest()
		{
            System.setProperty("webdriver.chrome.driver", "F:/JavaProjects/SeleniumJavaFramework/drivers/chromedriver/chromedriver.exe");
		    driver = new ChromeDriver();
		    
		    GoogleSearchPageObjects searchpageobj = new GoogleSearchPageObjects(driver);
		      driver.get("https://google.com");
		      searchpageobj.SetTextInSearchBox("Automation step by step");
		      searchpageobj.Buttonclick();
		      driver.close();
		      driver.quit();
	}

}
