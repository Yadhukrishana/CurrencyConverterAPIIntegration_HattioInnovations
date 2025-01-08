package com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.service;

import com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.exception.CurrencyAPIException;
import com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.model.ConversionRequest;
import com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.model.ConversionResponse;
import com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.util.CurrencyAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyService {

    private final CurrencyAPIClient currencyAPIClient;

    public Object getExchangeRates(String base) {
        try {
            return currencyAPIClient.fetchExchangeRates(base);
        } catch (Exception e) {
            throw new CurrencyAPIException("Unable to fetch exchange rates at the moment");
        }
    }

    public ConversionResponse convertCurrency(ConversionRequest request) {
        try {
            double convertedAmount = currencyAPIClient.convertCurrency(request.getFrom(), request.getTo(), request.getAmount());
            return new ConversionResponse(request.getFrom(), request.getTo(), request.getAmount(), convertedAmount);
        } catch (Exception e) {
            throw new CurrencyAPIException("Error while converting currency");
        }
    }
}
