package com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.controller;

import com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.model.ConversionRequest;
import com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.model.ConversionResponse;
import com.YadhuKrishnanKP.CurrencyConverterAPIIntegration.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CurrencyController {

    private CurrencyService currencyService;

    @Autowired
    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }
    @GetMapping("/rates")
    public ResponseEntity<?> getExchangeRates(@RequestParam(defaultValue = "USD") String base) {
        return ResponseEntity.ok(currencyService.getExchangeRates(base));
    }

    @PostMapping("/convert")
    public ResponseEntity<ConversionResponse> convertCurrency(@RequestBody ConversionRequest request) {
        return ResponseEntity.ok(currencyService.convertCurrency(request));
    }
}
