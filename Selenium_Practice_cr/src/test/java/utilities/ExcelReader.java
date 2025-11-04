package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelReader {

    public static String readValue(String SheetName, int row, int col) {

        String cellValue = "";
        try {
            String FilePath = System.getProperty("user.dir") + "/src/main/resources/Testdata.xlsx";

            FileInputStream fis = new FileInputStream(FilePath);

            Workbook book = new XSSFWorkbook(fis);
            Sheet sheet = book.getSheet(SheetName);
            Row rowNum = sheet.getRow(row);
            Cell colNum = rowNum.getCell(col);



            switch (colNum.getCellType()){

                case STRING :
                    cellValue = colNum.getStringCellValue();
                    break;
                case NUMERIC:
                    cellValue = String.valueOf(colNum.getNumericCellValue());
                    break;
                case BOOLEAN:
                    cellValue = String.valueOf(colNum.getBooleanCellValue());
                    break;
                default:
                    cellValue = "NA";
            }

            return cellValue;

        }
        catch (Exception e) {
            e.printStackTrace();

        }

        return cellValue;
    }
}
