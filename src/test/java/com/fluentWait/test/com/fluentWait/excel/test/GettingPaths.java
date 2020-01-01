package com.fluentWait.test.com.fluentWait.excel.test;

import java.io.File;

public class GettingPaths {
    public File path() {
        String currentDirectory = System.getProperty("user.dir");
        File fileName = new File("src/test/java/com/fluentWait/test/com/fluentWait/excel/test/datanew.xlsx");
        return fileName;
    }
}
