package com.fluentWait.test;

import java.io.File;

public class pract {

    private static String OPERATING_SYSTEM = System.getProperty("os.name").toLowerCase();

    public static void main(String[] args) {
        String path;
        if (OPERATING_SYSTEM.contains("win")) {
            System.out.println("You are using is Windows");
        } else if (OPERATING_SYSTEM.contains("mac")) {
            System.out.println("You are using Mac");
        } else if (OPERATING_SYSTEM.contains("nix") || OPERATING_SYSTEM.contains("nux") || OPERATING_SYSTEM.contains("aix")) {
            System.out.println("You are using Unix or Linux");
        } else {
            System.out.println("We can not find your OS!!");
        }
        String currentDirectory = System.getProperty("user.dir");
        File f = new File("/src/test/java/com/fluentWait/test/com/fluentWait/excel/test/datanew.xlsx");
        String absolutepath = f.getAbsolutePath();
        System.out.println(currentDirectory);
        System.out.println(absolutepath);
        System.out.println(currentDirectory+absolutepath);
    }
}



