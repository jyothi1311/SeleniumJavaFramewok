package utils;

public class excelUtilisDemo {
	
	public static void main(String[] args) {
		
		String projectpath=System.getProperty("user.dir");
		excelutils excel = new excelutils(projectpath+"/Excel/data.xlsx","sheet1");
		excel.getRowCount();
		excel.getColCount();
		excel.getCellDataString(1,0);
		excel.getCellDataNumber(1,1);
		
		
	}

}
