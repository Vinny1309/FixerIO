package com.sparta.vk.RatesData;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    //The below constants relate to the keys stored within the properties file
    private static final String PROPAPIKEY = "api_key";
    private static final String PROPBASEURL = "base_url";
    private static final String PROPLATESTENDPOINT = "latest_endpoint";
    private static final String PROPAPIACCESS = "api_access_url";

    private static String apiKey;
    private static String baseURL;
    private static String latestEndpoint;
    private static String accessURL;


    private PropertiesReader() {}

    public static String getApiKey() {
        if(apiKey == null){
            setUp();
        }
        return apiKey;
    }

    public static String getBaseURL() {
        if(baseURL == null){
            setUp();
        }
        return baseURL;
    }

    public static String getLatestEndpoint() {
        if(latestEndpoint == null){
            setUp();
        }
        return latestEndpoint;
    }

    public static String getAccessURL() {
        if(accessURL == null){
            setUp();
        }
        return accessURL;
    }

    private static void setUp(){
        Properties appProperties = new Properties();

        try {
            appProperties.load(new FileReader("app.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        apiKey = appProperties.getProperty(PROPAPIKEY);
        baseURL = appProperties.getProperty(PROPBASEURL);
        latestEndpoint = appProperties.getProperty(PROPLATESTENDPOINT);
        accessURL = appProperties.getProperty(PROPAPIACCESS);
    }
}
