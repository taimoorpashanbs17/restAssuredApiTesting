package com.fluentWait.test;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class pract {

    public Object[][] getData() throws EncryptedDocumentException,
            InvalidFormatException, IOException {
        FileInputStream fis = new FileInputStream(
                "D:\\GitHub\\restAssuredApiTesting\\src\\test\\java\\com\\fluentWait\\test\\com\\fluentWait\\excel\\test\\datanew.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheetAt(0);

        int rowCount = sh.getLastRowNum();
        int colCount = sh.getRow(0).getLastCellNum();
        Object[][] data = new Object[rowCount][colCount];

        for (int i = 0; i <= rowCount; i++) {
            for (int j = 0; j < colCount; j++) {

                data[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
                System.out.print(data[i][j] + "\t");

            }
            System.out.println();
        }
        return data;
    }

}