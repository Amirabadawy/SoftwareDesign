package org.readSystem.excelRead;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader1 {


    public ExcelReader1(String filePath) {
    }

    public static void readExcel(String filePtah) throws IOException {

    FileInputStream fis = new FileInputStream(filePtah);
             Workbook workbook = new XSSFWorkbook(fis);

            // Assuming you are working with the first sheet
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through rows and cells
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Depending on your cell's type, you can get the value as follows
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        // Handle other cell types as needed
                    }
                }
                System.out.println(); // Start a new line for each row
            }
    }

    public static String getCellValue(String filePath, int sheetIndex, int rowNum, int colNum) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(sheetIndex);
            Row row = sheet.getRow(rowNum);

            if (row != null) {
                Cell cell = row.getCell(colNum);

                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            return cell.getStringCellValue();
                        case NUMERIC:
                            return String.valueOf(cell.getNumericCellValue());
                        case BOOLEAN:
                            return String.valueOf(cell.getBooleanCellValue());
                        // Handle other cell types as needed
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Return an empty string if the cell is not found or an error occurs
        return "";
    }

}
