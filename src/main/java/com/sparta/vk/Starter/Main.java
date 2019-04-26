package com.sparta.vk.Starter;

import com.sparta.vk.RatesService;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        RatesService rates = new RatesService();
        System.out.println(rates.getRatesDeserialiser().ratesMappedDTO.getRates().get("AED"));
    }
}
