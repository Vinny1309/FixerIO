package com.sparta.vk;

import com.sparta.vk.RatesData.HTTPManager;
import com.sparta.vk.RatesData.RatesDeserialiser;

public class RatesService {

    private RatesDeserialiser ratesDeserialiser;

    public void RatesService(){
       HTTPManager latestRatesHTTPManager = new HTTPManager();
       latestRatesHTTPManager.makeAllRatesCall();
       ratesDeserialiser = new RatesDeserialiser(latestRatesHTTPManager.getResponseBody());
    }

//    public void HistoricRatesService(String date){
//        HTTPManager historicalRatesHTTPManager = new HTTPManager();
//        historicalRatesHTTPManager.makeAllHistoricalRatesCall(date);
//        ratesDeserialiser = new RatesDeserialiser(historicalRatesHTTPManager.getResponseBody());
//    }

    public RatesDeserialiser getRatesDeserialiser(){
        return ratesDeserialiser;
    }
}
