package com.fluentWait.test;

import java.io.File;

public class usable_Data {
    private String url = "https://jsonplaceholder.typicode.com/users";
    private String expected_contentType = "application/json";
    private String payload = "[\n" +
            "    {\n" +
            "        \"id\": 11,\n" +
            "        \"name\": \"Krishna Rungta\",\n" +
            "        \"username\": \"Bret\",\n" +
            "        \"email\": \"Sincere@april.biz\",\n" +
            "        \"address\": {\n" +
            "            \"street\": \"Kulas Light\",\n" +
            "            \"suite\": \"Apt. 556\",\n" +
            "            \"city\": \"Gwenborough\",\n" +
            "            \"zipcode\": \"92998-3874\",\n" +
            "            \"geo\": {\n" +
            "                \"lat\": \"-37.3159\",\n" +
            "                \"lng\": \"81.1496\"\n" +
            "            }\n" +
            "        },\n" +
            "        \"phone\": \"1-770-736-8031 x56442\",\n" +
            "        \"website\": \"hildegard.org\",\n" +
            "        \"company\": {\n" +
            "            \"name\": \"Romaguera-Crona\",\n" +
            "            \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
            "            \"bs\": \"harness real-time e-markets\"\n" +
            "        }\n" +
            "    }\n" +
            "]";

    public String newUrl() {
        return url;
    }

    public String getPayload() {
        return payload;
    }

    public String getExpected_contentType() {
        return expected_contentType;
    }

    public String path() {
        String currentDirectory = System.getProperty("user.dir");
        File f = new File("/restAssuredApiTesting/src/test/java/com/fluentWait/test/com/fluentWait/excel/test/datanew.xlsx");
        String absolutepath = f.getAbsolutePath();
        String actualPath = currentDirectory+absolutepath;
        return actualPath;
    }
}

