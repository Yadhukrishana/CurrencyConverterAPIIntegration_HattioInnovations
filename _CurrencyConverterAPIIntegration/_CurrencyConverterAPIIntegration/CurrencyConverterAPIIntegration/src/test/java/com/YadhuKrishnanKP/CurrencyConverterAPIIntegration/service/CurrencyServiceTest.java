package com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.service;

import com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.model.ConversionRequest;
import com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.model.ConversionResponse;
import com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.util.CurrencyAPIClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CurrencyServiceTest {

    @Mock
    private CurrencyAPIClient currencyAPIClient;  // Mocked CurrencyAPIClient

    @InjectMocks
    private CurrencyService currencyService;  // The service being tested, will be injected automatically

    @Test
    public void testConvertCurrency() {
        // Prepare the request
        ConversionRequest request = new ConversionRequest("USD", "EUR", 100);

        // Mock the behavior of the external API client
        when(currencyAPIClient.convertCurrency("USD", "EUR", 100)).thenReturn(94.5);

        // Call the method to be tested
        ConversionResponse response = currencyService.convertCurrency(request);

        // Assert that the converted amount is correct
        assertEquals(94.5, response.getConvertedAmount());
    }
}
