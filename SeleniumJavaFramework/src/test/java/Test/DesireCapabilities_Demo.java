package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesireCapabilities_Demo {
	
	public static void main(String[] args) {
		
		DesiredCapabilities desc=new DesiredCapabilities();
		desc.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver", "F:/JavaProjects/SeleniumJavaFramework/drivers/IEdriver/IEDriverServer.exe");
		
	    WebDriver driver = new InternetExplorerDriver();
	    driver.get("https://google.com");
	    driver.findElement(By.name("q")).sendKeys("Automation step by step");
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    driver.close();
	    driver.quit();
	}

}
