# CurrencyConverterAPIIntegration_HattioInnovations


A simple Spring Boot application to convert currency using real-time or mock exchange rates.

## Features
1. Fetch real-time or mock exchange rates.
2. Convert an amount between currencies.

## Prerequisites
1. Java 17 or higher
2. Maven 3.6+
3. Internet connection (if connecting to an external API)

## API Documentation

### 1. Fetch Exchange Rates
**Endpoint**: `GET /api/rates?base={baseCurrency}`

**Description**: Fetch the exchange rates for a given base currency. Defaults to `USD` if no base currency is provided.

**Request Example**:
```bash
curl -X GET "http://localhost:8080/api/rates?base=USD"
##Response Example
{
  "base": "USD",
  "rates": {
    "EUR": 0.945,
    "JPY": 144.5,
    "GBP": 0.754
  },
  "timestamp": "2025-01-07T10:00:00Z"
}



CurrencyConverterAPIIntegration/
│
├── src/
│   ├── main/
│   │   ├── java/com/YadhuKrishnanKP/CurrencyConverterAPIIntegration/
│   │   │   ├── controller/      # REST API Controllers
│   │   │   ├── service/         # Business Logic
│   │   │   ├── model/           # Data Models
│   │   │   ├── config/          # Configuration Classes
│   │   │   ├── Application.java # Main Spring Boot Application
│   │   └── resources/
│   │       ├── application.properties # API Configurations
│   │       └── static/                # Static Resources
│   │
│   └── test/
│       ├── java/com/YadhuKrishnanKP/CurrencyConverterAPIIntegration/
│       │   └── service/         # Unit Tests
│       └── resources/           # Test Configurations
│
├── pom.xml                      # Maven Build File
├── README.md                    # Project Documentation
└── .gitignore                   # Ignored Files


