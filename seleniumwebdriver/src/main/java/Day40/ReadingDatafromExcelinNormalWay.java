package Day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDatafromExcelinNormalWay {

	public static void main(String[] args) throws IOException  {
		
		// --------------- Read data from Excel-----------------------------
		
		// Prerequisite - Apache POI common and Apache POI API from mvn repository and paste it in POM.xml
		// Excelfile -> Workbook -> Sheet -> rows -> cells
		// XSSFWorkbook class for - Workbook
		// XSSFSheet class for -  sheet
		// XSSFRows class for -  rows
		// XSSFCells class for - cells
		// FileInputStream - to open the excel file in reading mode
		// FileOutputStream - to open the excel file in writing mode
		
		// Reading data from Excel in normal way 
		// opening excel file in reading mode
		
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\Untitled spreadsheet.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(fs);
	    XSSFSheet sh=wb.getSheet("Sheet1");
	    int rowcount=sh.getLastRowNum();
	    int cellcount=sh.getRow(0).getLastCellNum();
	    System.out.println(rowcount);
	    System.out.println(cellcount);
	    
	    for(int r=0; r<=rowcount;r++)     // row count starts from 0 at runtime 
	    {
	    	XSSFRow currentrow=sh.getRow(r);
	    	for(int c=0;c<cellcount;c++)       // cell count starts from 1 at runtime
	    	{
	    		XSSFCell cell=sh.getRow(r).getCell(c);
	    		System.out.println(cell.toString()+ "\t");
	    	}
	    	
	    	System.out.println();
	    	
	    		
	    }
	    
	    fs.close();
	    wb.close();
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
