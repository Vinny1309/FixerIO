package com.sparta.vk;

import com.sparta.vk.RatesData.HTTPManager;
import com.sparta.vk.RatesData.RatesDeserialiser;

public class RatesService {

    private RatesDeserialiser ratesDeserialiser;

    public RatesService(){
       HTTPManager latestRatesHTTPManager = new HTTPManager();
       ratesDeserialiser = new RatesDeserialiser(latestRatesHTTPManager.getResponseBody());
    }

    public RatesDeserialiser getRatesDeserialiser(){
        return ratesDeserialiser;
    }
}
