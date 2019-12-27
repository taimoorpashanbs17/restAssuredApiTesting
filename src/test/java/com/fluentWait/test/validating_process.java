package com.fluentWait.test;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class validating_process {
    private static usable_Data data = new usable_Data();
    private static usersData user_Data = new usersData();
    private static String url = data.newUrl();
    private static String expected_contentType = data.getExpected_contentType();
    private static String expected_name = user_Data.getName();
    private static String expected_userName = user_Data.getUsername();
    private static String expected_email = user_Data.getEmail();


    @Test
    public void GetStatus() {
        given().when().get(url).
                then().
                statusCode(200);
    }


    @Test
    public void CheckContentType(){
        given().when().get(url).
                then().contentType(expected_contentType);
    }


    @Test
    public void VerifyingValues(){
        given().when().get(url).then().
                assertThat().
                body("email[2]", equalTo(expected_email)).
                and().body("username[2]", equalTo(expected_userName)).
                and().body("name[2]", equalTo(expected_name));
    }


    @Test
    public void GettingCompanyDetails(){
        int id = 10;
        String appended_url = url+"/"+id;
        Response response = given().when().get(appended_url);
        Map<String, String> company = response.jsonPath().getMap("company");
        System.out.println(company);
    }


    @Test
    public void GettingAddress(){
        int id = usersData.GettingAddress.company_id;
        usersData.companyData company_Data = new usersData.companyData();
        String appended_url = url+"/"+id;
        String street = usersData.GettingAddress.street;
        String city = usersData.GettingAddress.city;
        String suite = usersData.GettingAddress.suite;
        String zipcode = usersData.GettingAddress.zipcode;
        String geo_lng = usersData.GettingAddress.longitude;
        String geo_lat = usersData.GettingAddress.latitude;
        given().when().get(appended_url)
                .then().assertThat().body(street, equalTo(company_Data.getCompanyStreet()))
                .body(city, equalTo(company_Data.getCompanyCity()))
                .body(suite, equalTo(company_Data.getCompanySuite()))
                .body(zipcode, equalTo(company_Data.getZipCode()))
                .body(geo_lat, equalTo(company_Data.getLatitude()))
                .body(geo_lng, equalTo(company_Data.getLongitude()));
    }
}