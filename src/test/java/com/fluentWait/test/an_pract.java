package com.fluentWait.test;


import com.google.gson.JsonObject;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class an_pract {
        private usable_Data data = new usable_Data();
        private String url = data.newUrl();

        @DataProvider
    public Object[][] testData() throws EncryptedDocumentException,
            InvalidFormatException, IOException {
        pract fd = new pract();
        Object[][] data = fd.getData();
        return data;
    }
        @Test(dataProvider = "testData")
        public void basicDataDrivenTest(String name, String username, String email) {
            JsonObject data = new JsonObject();
//            data.addProperty("id", id);
            data.addProperty("name", name);
            data.addProperty("username", username);
            data.addProperty("email", email);

            given().body(data.toString()).
                    when().post(url).
                    then().statusCode(201);
        }

    }

