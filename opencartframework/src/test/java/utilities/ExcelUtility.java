package utilities;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility {
	
	public FileInputStream fi;
    public FileOutputStream fo;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;

    String path;

    // Constructor
    public ExcelUtility(String path) {
        this.path = path;
    }

    // 🔹 Get Row Count
    public int getRowCount(String sheetName) throws IOException {

        fi = new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
        sheet = workbook.getSheet(sheetName);

        int rowcount = sheet.getLastRowNum();

        workbook.close();
        fi.close();

        return rowcount;
    }

    // 🔹 Get Column Count
    public int getCellCount(String sheetName, int rownum) throws IOException {

        fi = new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
        sheet = workbook.getSheet(sheetName);

        row = sheet.getRow(rownum);
        int colcount = row.getLastCellNum();

        workbook.close();
        fi.close();

        return colcount;
    }

    // 🔹 Get Cell Data
    public String getCellData(String sheetName, int rownum, int colnum) throws IOException {

        fi = new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
        sheet = workbook.getSheet(sheetName);

        row = sheet.getRow(rownum);
        cell = row.getCell(colnum);

        String data;

        try {
            data = cell.toString();
        } catch (Exception e) {
            data = "";
        }

        workbook.close();
        fi.close();

        return data;
    }
}


