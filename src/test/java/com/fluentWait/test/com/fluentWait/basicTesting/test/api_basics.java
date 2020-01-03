package com.fluentWait.test.com.fluentWait.basicTesting.test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class api_basics {
    private static usable_Data data = new usable_Data();
    private static String post_payload = data.getPayload();
    private static String expected_contentType = data.getExpected_contentType();
    private static String url = data.newUrl();

    @Test
    public void runGetMethod(){
            Response response =given().when().get(url);
            String jsonAsString = response.asString();
            System.out.println(jsonAsString);
    }

    @Test
    public void AddUser(){
        given().contentType(expected_contentType).body(post_payload).when().
                post(url).
                then().statusCode(201);
    }

    @Test
    public void GetUsers(){
        Response response = given().when().get(url);
        String usernames = response.jsonPath().getString("username");
        System.out.println(usernames);
    }

}


