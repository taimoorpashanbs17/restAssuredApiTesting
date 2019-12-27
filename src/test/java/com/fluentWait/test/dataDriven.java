package com.fluentWait.test;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.testng.annotations.Test;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


import static io.restassured.RestAssured.given;

public class dataDriven {
    private static usable_Data data = new usable_Data();
    private static String url = data.newUrl();

    @Test(dataProvider="dataFeed", dataProviderClass=provideData.class)
    public void basicDataDrivenTest(int id, String name, String username, String email ){
        JsonObject data = new JsonObject();
        data.addProperty("id", id);
        data.addProperty("name", name);
        data.addProperty("username", username);
        data.addProperty("email", email);

        given().body(data.toString()).
                when().post(url).
                then().statusCode(201);
    }
    @Test
    public void createPayLoad() throws JsonProcessingException {
        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("id", 14);
        payload.put("name", "Sajjad");
        payload.put("username", "Sajji");
        payload.put("email", "sajji@north.com");
        payload.put("phone", "1-770-736-8561 x4532");
        payload.put("website","hildeffd.org");
        Map<String, Object> address = new HashMap<String, Object>();
        address.put("street", "23 Street");
        address.put("suite", "234 suite");
        address.put("city", "Lahore");
        address.put("zipcode", "435-989");
        payload.put("address", address);
        Map<String, Object> geo = new HashMap<String, Object>();
        geo.put("lat","37.3134");
        geo.put("lng","-67.3159");
        address.put("geo",geo);
        Map<String, Object> company = new HashMap<String, Object>();
        company.put("name","Romaguera-Crona");
        company.put("catchPhrase", "This is Catching Phrase");
        company.put("bs","harness markets");
        payload.put("company", company);
        ObjectMapper mapper = new ObjectMapper();
        String payload_json = mapper.writeValueAsString(payload);
        System.out.println(payload_json);
    }
}
