package com.sparta.vk.RatesData;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HTTPManager {

    private CloseableHttpResponse fullResponse;

    public HTTPManager() {
        makeAllRatesCall();
    }

    //Constructor method
    private void makeAllRatesCall() {
        try {
        //Handles the call
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //Does the call
        HttpGet getLatestRates = new HttpGet(PropertiesReader.getBaseURL() + PropertiesReader.getLatestEndpoint() + PropertiesReader.getAccessURL()+ PropertiesReader.getApiKey());
        //Catches the call
        fullResponse = httpClient.execute(getLatestRates);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Accessor methods

    public String getResponseBody(){
        String bodyResult = null;

        try{
            bodyResult = EntityUtils.toString(fullResponse.getEntity());
        } catch(IOException e){
            e.printStackTrace();
            throw new RuntimeException();
        }
        return bodyResult;
    }
}
