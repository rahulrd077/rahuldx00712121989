package com.Scneider.Xyphias.testUtil;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Scneider.Xyphias.TestBase.TestBaseDotNew;

public class UtilDotNew extends TestBaseDotNew{
	
	public static Workbook workbookobj;
	
	public static Sheet sheetobj;

	public static String EXCEL_HOME_PATH = "D:\\Eclipse Workspace\\Xyphias-webappNew\\src\\main\\java\\com\\Scneider\\Xyphias\\Excel\\FreeCRM.xlsx";
	
	
	public static long IMPLICIT_WAIT_SECONDS = 30;
	
	public static long PAGE_LOAD_TIMEOUT_SECONDS = 30;
	
	public void SwitchFramesAgain() {
		
		driver.switchTo().frame("mainpanel");
	}
	
	public static Object[][] getDatadetails (String sheetName){
		
		FileInputStream files = null;
		
		try {
			
			files = new FileInputStream(EXCEL_HOME_PATH);
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		try {
			
			workbookobj = WorkbookFactory.create(files);
		}
		
catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		sheetobj = workbookobj.getSheet(sheetName);
		
		
		Object[][] data = new Object[sheetobj.getLastRowNum()][sheetobj.getRow(0).getLastCellNum()];
		
		
		for(int i = 0 ; i<sheetobj.getLastRowNum() ; i++) {
			
			for(int j = 0; j<sheetobj.getRow(0).getLastCellNum(); j++) {
				
				data[i][j] = sheetobj.getRow(i+1).getCell(j).toString();
				
				
			}
		}
		
		return data;
	}
	
	
}
