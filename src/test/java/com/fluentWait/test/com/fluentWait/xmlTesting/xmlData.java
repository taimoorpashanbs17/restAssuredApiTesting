package com.fluentWait.test.com.fluentWait.xmlTesting;



public class xmlData {

    private String jsonFormat = "json";
    private  String url = "http://fakerestapi.azurewebsites.net/api/Activities";
    private String contentType = "application/xml";
    private int port;


    public String getURL(){
        return url;
    }

    public String getContentType(){
        return contentType;
    }
    public static void main (String[] args){
        xmlData data = new xmlData();
        System.out.println("Exact URL is: ");
        System.out.println(data.url);
    }

}
