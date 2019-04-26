package com.sparta.vk.Starter;

import com.sparta.vk.HistoricalRatesService;
import com.sparta.vk.RatesService;

public class Main
{
    public static void main( String[] args )
    {
        RatesService rates = new RatesService();
        rates.RatesService();
        System.out.println(rates.getRatesDeserialiser().ratesMappedDTO.getRates());

        HistoricalRatesService historicalRates = new HistoricalRatesService();
        historicalRates.HistoricRatesService("2012-12-24");
        System.out.println(historicalRates.getRatesDeserialiser().ratesMappedDTO.getRates());


//        RatesService historicalRates = new RatesService();
//        historicalRates.HistoricRatesService("2013-12-24");
//        System.out.println(historicalRates.getRatesDeserialiser().ratesMappedDTO.getRates());
    }
}
