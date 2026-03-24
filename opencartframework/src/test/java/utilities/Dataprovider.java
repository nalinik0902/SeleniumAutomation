package utilities;
import java.io.IOException;

import org.testng.annotations.DataProvider;



public class Dataprovider {
	
	@DataProvider(name = "LoginData")
    public String[][] getData() throws IOException {

        String path = ".\\testData\\LoginTestdata.xlsx";

        ExcelUtility xlutil = new ExcelUtility(path);

        int totalrows = xlutil.getRowCount("Sheet1");
        int totalcols = xlutil.getCellCount("Sheet1", 1);

        String logindata[][] = new String[totalrows][totalcols];

        for (int i=1; i<= totalrows; i++) { // rows  row 0 -> header; Data starts from row 1

            for (int j=0; j<totalcols; j++) { // columns

                logindata[i-1][j] = xlutil.getCellData("Sheet1", i, j);   // i-1 used because excel starts from 1; Array index starts from 0
            }
        }

        return logindata;
    }
}


