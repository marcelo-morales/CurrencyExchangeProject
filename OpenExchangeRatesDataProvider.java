package org.codelab.currencyCalculator.services;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.List;

public class OpenExchangeRatesDataProvider implements DataProvider {
    private static String OPEN_EXCHANGE_URI = Uri.
    private static String APP_ID = "ef0fa92c95d345cd8b236c17f7da8cc8";

    public static void main(String ... args) {

    }

    private void getCurrency(String baseCurrency, List<String> targetCurrencies ) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(openExchangeUri).build();

        HttpClient client = HttpClient.newHttpClient();
        client.send(HttpRequest.newBuilder()
                .GET().build(), responseInfo -> {

        });
    }
}
