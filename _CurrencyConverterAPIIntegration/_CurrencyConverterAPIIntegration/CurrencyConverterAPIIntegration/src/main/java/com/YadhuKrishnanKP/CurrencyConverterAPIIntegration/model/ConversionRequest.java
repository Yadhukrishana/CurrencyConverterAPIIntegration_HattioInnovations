package com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConversionRequest {
    private String from;
    private String to;
    private double amount;
}
