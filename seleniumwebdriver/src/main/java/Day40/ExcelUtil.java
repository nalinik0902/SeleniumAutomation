package Day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getrowcount(String xlfile,String xlsheet ) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		int rowcount=sh.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
		
 }
	public static int getcellcount(String xlfile,String xlsheet,int rownum) throws IOException {
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		row=sh.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
		
 }
	public static String getcelldata(String xlfile,String xlsheet,int rownum,int cellnum) throws IOException {
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		row=sh.getRow(rownum);
		cell=row.getCell(cellnum);
		
		String data=cell.toString();
		wb.close();
		fi.close();
		return data;
		
		
	}




}
	
	


