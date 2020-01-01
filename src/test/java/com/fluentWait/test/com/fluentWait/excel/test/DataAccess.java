package com.fluentWait.test.com.fluentWait.excel.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class DataAccess {
    private GettingPaths getFile = new GettingPaths();
    private File excelPath = getFile.path();
    private String currentDirectory = System.getProperty("user.dir");
    private String ActualPath = currentDirectory+"/"+excelPath;
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;

    @Test
    public void AccessFromExcelSheet() throws IOException {
        File excelFile = new File(String.valueOf(ActualPath));
        FileInputStream fis = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
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