package org.readSystem.excelRead;


import java.io.IOException;


public class ExcelReader {

    String filePath;

    public void readExcelFile(int sheetIndex) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream(filePath);
//        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//        XSSFSheet sheet = workbook.getSheetAt(sheetIndex);
//        Iterator<Row> itr = sheet.iterator();
//        while (itr.hasNext()) {
//            Row row = itr.next();
//            Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
//            while (cellIterator.hasNext()) {
//                Cell cell = cellIterator.next();
//                switch (cell.getCellType()) {
//                    case Cell.CELL_TYPE_STRING:    //field that represents string cell type
//                        System.out.print(cell.getStringCellValue() + "\t\t\t");
//                        break;
//                    case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type
//                        System.out.print(cell.getNumericCellValue() + "\t\t\t");
//                        break;
//                    default:
//                }
//            }
//            System.out.println("");
//        }
    }

}


