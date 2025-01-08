package com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.util;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CurrencyAPIClient {

    private static final String EXCHANGE_RATE_URL = "https://api.exchangerate-api.com/v4/latest/";

    public Object fetchExchangeRates(String base) {
        String url = EXCHANGE_RATE_URL + base;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Object.class);
    }

    public double convertCurrency(String from, String to, double amount) {
        String url = EXCHANGE_RATE_URL + from;
        RestTemplate restTemplate = new RestTemplate();
        Object rates = restTemplate.getForObject(url, Object.class);
        // Logic to extract conversion rate and convert the amount
        double rate = extractRateFromResponse(rates, to);
        return amount * rate;
    }

    private double extractRateFromResponse(Object rates, String to) {
        // Extract rate from API response
        return 0.94;  // Placeholder rate for simplicity
    }
}
