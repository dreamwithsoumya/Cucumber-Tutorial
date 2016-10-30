package org.soumya.com.selenium.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class POITest {
	FileInputStream fis;
	XSSFWorkbook book;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@BeforeTest
	public void setUp(){
	
		
	}
	@Test(dataProvider = "getData")
	public void testPOI(String username,String password) throws IOException{
		System.out.println("user : "+username+"  "+ "password: "+password);
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException{
		fis = new FileInputStream("C:\\POI\\test.xlsx");
		book = new XSSFWorkbook(fis);
		sheet = book.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum()+1;
		int columnCount = sheet.getRow(0).getLastCellNum();
	    Object[][] object = new Object[rowCount-1][columnCount];
	    for(int rNum=2;rNum<=rowCount;rNum++){
	    	for(int cNum=0;cNum<columnCount;cNum++){
	    		object[rNum-2][cNum] = getCellData("Sheet1",cNum,rNum);
	    	}
	    }
	    return object;
		
	}
	@SuppressWarnings("deprecation")
	private String getCellData(String string, int cNum, int rNum) {
		 int index = book.getSheetIndex(string);
		 if(index==-1)
			 return "";
		 sheet = book.getSheetAt(index);
		 row = sheet.getRow(rNum-1);
		 if(row==null)
			 return "";
		 cell = row.getCell(cNum);
		 if(cell==null)
			 return "";
		 
		 if(cell.getCellType()==Cell.CELL_TYPE_STRING)
			 return cell.getStringCellValue();
		 else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC || cell.getCellType()==cell.CELL_TYPE_FORMULA)
		 {
			 String cellText = String.valueOf(cell.getNumericCellValue());
			 return cellText;
		 }
		 else if (cell.getCellType()==cell.CELL_TYPE_BLANK)
			 return "";
		 else
			 return String.valueOf(cell.getBooleanCellValue());
		 
		 
		 
		 
		 
	
	}

}
