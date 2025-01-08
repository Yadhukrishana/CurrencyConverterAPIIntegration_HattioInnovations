package com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ConversionResponse {
    private String from;
    private String to;
    private double amount;
    private double convertedAmount;
}
