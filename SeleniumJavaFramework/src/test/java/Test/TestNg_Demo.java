package Test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;



public class TestNg_Demo {
	
	static WebDriver driver=null;
	
	@BeforeTest
	public void SetUpTest()
	{
		 System.setProperty("webdriver.chrome.driver", "F:/JavaProjects/SeleniumJavaFramework/drivers/chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public  void googlesearch()
	{
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
       driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	@AfterTest
   public void TearDownTest()
   {
	   driver.close();
		//driver.quit();
		System.out.println("Test completed successfully");
   }
}
