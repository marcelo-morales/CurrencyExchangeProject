//package org.codelab.currencyCalculator.services;

import java.math.BigDecimal;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.List;

import java.sql.*;

/*
will connect to Open Exchanges Rates API, will connect to API

 https://openexchangerates.org/api/latest.json?app_id=a0eea9f5a84049feb8523bdba65be04f
 */




public class OpenExchangeRatesDataProvider implements DataProvider {
    //private static String OPEN_EXCHANGE_URI =
    //private static String APP_ID = "ef0fa92c95d345cd8b236c17f7da8cc8";

    public BigDecimal getCurrency(String inputCurrency, String outputCurrency) {

        return null;
    }



    public static void main(String [] args) {
        //String connectionURL = https://openexchangerates.org/api/latest.json?app_id=a0eea9f5a84049feb8523bdba65be04f;



    }




    /*
    private void getCurrency(String baseCurrency, List<String> targetCurrencies ) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(openExchangeUri).build();

        HttpClient client = HttpClient.newHttpClient();
        client.send(HttpRequest.newBuilder()
                .GET().build(), responseInfo -> {

        });
    }
    */

}
