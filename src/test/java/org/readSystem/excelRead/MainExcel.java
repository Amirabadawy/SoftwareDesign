package org.readSystem.excelRead;

import static org.readSystem.excelRead.ExcelReader1.getCellValue;

public class MainExcel {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Amira\\IdeaProjects\\Software-Design\\src\\test\\resources\\test.xlsx"; // Provide the path to your Excel file
        int sheetIndex = 0; // Index of the sheet to read
        int rowNum = 1; // Row number (0-based) of the cell to retrieve
        int colNum = 2; // Column number (0-based) of the cell to retrieve
        ExcelReader1 excelReader1 = new ExcelReader1(filePath);
        excelReader1.

    }

//    String cellValue = getCellValue(filePath, sheetIndex, rowNum, colNum);
//
//        if (!cellValue.isEmpty()) {
//        System.out.println("Cell Value: " + cellValue);
//        } else {
//        System.out.println("Cell not found or empty.");
//    }
}
