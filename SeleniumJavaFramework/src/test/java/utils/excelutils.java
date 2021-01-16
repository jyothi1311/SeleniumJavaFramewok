package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public excelutils(String excelPath,String sheetName){
		
		
		try {
			
			workbook = new XSSFWorkbook(excelPath);
			sheet =workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	
	public static int getRowCount()
	{
	   int rowcount =0;
	try {
		
	    rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("number of rows:"+rowcount);
	} 
	catch (Exception e) 
	{
				e.printStackTrace();
	}return rowcount;
	}
	
	public static int getColCount()
	{
		int colcount=0;
	  
	try {
		
		 colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("number of cols:"+colcount);
	} 
	catch (Exception e) 
	{
				e.printStackTrace();
	}return colcount;
	}
	  
	 public static String getCellDataString(int rowNum, int colNum)
	 {
		 String cellData=null;
		 
		 try {
			
			 cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println("celldata:   "+cellData);
		}
		 catch (Exception e) 
			{
				
				e.printStackTrace();
			}return cellData;
		 
	 }
	 
	 public static void getCellDataNumber(int rowNum, int colNum)
	 {
		 
		 try {
			
			double celldata=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("celldata:   "+celldata);
		}
		 catch (Exception e) 
			{
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
		 
	 }
	}


