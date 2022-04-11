package DataDProviderDemo.DataProvider;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class DataSheetRead {

    public static Object[][] getMyData(String fileName,String sheetName) throws IOException {

        FileInputStream fis = new FileInputStream(fileName);
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rowCount-1][colCount];

        for (int i = 0; i<rowCount-1;i++)
        {
            HSSFRow row = sheet.getRow(i+1);

            for(int j=0;j<colCount;j++)
            {
                HSSFCell cell = row.getCell(j);
                if (cell==null)
                    data[i][j] = "";
                else {
                    data[i][j] = cell.toString().trim();
                }
            }
        }
        return data;
    }
}
