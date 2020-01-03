package com.fluentWait.test.com.fluentWait.basicTesting.test;

public class usersData {
    private String email = "Nathan@yesenia.net";
    private String username = "Samantha";
    private String name = "Clementine Bauch";

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getName(){
        return name;
    }
    public static class companyData{
        private String companyStreet = "Ellsworth Summit";
        private String companySuite = "Suite 729";
        private String companyCity = "Aliyaview";
        private String zipCode = "45169";
        private String latitude = "-14.3990";
        private String longitude = "-120.7677";

        public String getCompanyStreet(){
            return companyStreet;
        }

        public String getCompanySuite(){
            return companySuite;
        }

        public  String getCompanyCity(){
            return companyCity;
        }

        public String getZipCode(){
            return zipCode;
        }

        public String getLatitude(){
            return latitude;
        }

        public String getLongitude(){
            return longitude;
        }

    }

    public static class GettingAddress{
        public static int company_id = 8;
        public static String street = "address.street";
        public static String city = "address.city";
        public static String suite = "address.suite";
        public static String zipcode = "address.zipcode";
        public static String latitude = "address.geo.lat";
        public static String longitude = "address.geo.lng";
    }


}



