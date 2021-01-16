package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void SetUpTest()
	{
		 System.setProperty("webdriver.chrome.driver", "F:/JavaProjects/SeleniumJavaFramework/drivers/chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test(dataProvider ="test1data")
	public void test1(String username,String password) throws InterruptedException
	{
		System.out.println(username+ "    "+password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
		//driver.findElement(By.name("Submit")).click();
	}
	@DataProvider(name="test1data")
	 public  Object[][] getData()
	 {
		String excelPath="F:\\JavaProjects\\SeleniumJavaFramework\\Excel\\data.xlsx";
		Object data[][]=testdata(excelPath,"sheet1");
		return data;
	 }
	
	public  Object[][] testdata(String excelPath,String sheetName)
	{
		excelutils excel = new excelutils(excelPath,sheetName);
		int rowcount=excel.getRowCount();
		int colcount=excel.getColCount();
		
		Object data[][]= new Object[rowcount-1][colcount];
		for(int i=1; i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String cellData= excel.getCellDataString(i, j);
				//System.out.println("cellData:  " +cellData);
				data[i-1][j]=cellData;
				
			}
		}return data;
	}

}
