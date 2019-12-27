package com.fluentWait.test;
import org.testng.annotations.DataProvider;


public class provideData {
    @DataProvider(name = "dataFeed")

    public static Object[][] dataFeed() {

        return new Object[][]{
                {12, "Taimoor", "Tam", "tam@noth.com"},
                {13, "Sajjid", "Sajji", "sajji@noth.com"},
                {14, "Kashif", "Kashi", "Kashi@noth.com"},
                {15, "Ahmed", "Emi", "emi@noth.com"},
                {16, "Naveed", "Naveed", "naveed@noth.com"},
                {17, "Basit", "Doctor", "doctor@noth.com"},
                {18, "Asim", "Sajjid ka Yaar", "asim@noth.com"}

        };
    }
}

