package com.sparta.vk.RatesData;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.vk.RatesData.RatesDTO;

public class RatesDeserialiser {

    public RatesDTO ratesMappedDTO;

    public RatesDeserialiser(String filePath) {
        ObjectMapper ratesObject = new ObjectMapper();

        try{
            ratesMappedDTO = ratesObject.readValue(filePath, RatesDTO.class);
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
