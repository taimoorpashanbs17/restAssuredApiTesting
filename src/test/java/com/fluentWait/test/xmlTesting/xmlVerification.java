package com.fluentWait.test.xmlTesting;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class xmlVerification {
    private xmlData data = new xmlData();
    private String url = data.getURL();
    private String contentType = data.getContentType();

    @Test
    public void GetStatusCode(){
        given().when().get(url).
                then().
                statusCode(200);
    }

    @Test
    public void VerifyData(){
        given().when().get().
                then().contentType(contentType).
                assertThat().body("response.result[0].message",
                equalTo("Your request was made with invalid credentials."));

    }

    @Test
    public void VerifyContentType(){
        given().when().get(url).
                then().contentType(contentType);
    }
    }

