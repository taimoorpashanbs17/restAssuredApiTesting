package com.fluentWait.test.com.fluentWait.excel.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataAccess {
    @Test
    public void AccessFromExcelSheet() throws IOException {
        File excelFile = new File("D:\\GitHub\\restAssuredApiTesting\\src\\test\\java\\com\\fluentWait\\test\\com\\fluentWait\\excel\\test\\datanew.xlsx");
        FileInputStream fis = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIt = sheet.iterator();
        while (rowIt.hasNext()) {
            Row row = rowIt.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                System.out.print(cell.toString() + " ");
            }
            System.out.println();
        }
        workbook.close();
        fis.close();
    }
}