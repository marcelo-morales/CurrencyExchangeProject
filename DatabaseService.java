package org.codelab.currencyCalculator.services;

import java.math.BigDecimal;

import org.codelab.currencyCalculator.services.data.CurrencyDAO;

/*
 *  id|currencyName|rate|timestamp
 *
 *  SELECT rate FROM CurrencyRates WHERE currencyName = "?" SORT BY timestamp
 */

public class DatabaseService {
    private final CurrencyDAO currencyDAO;

    public DatabaseService(CurrencyDAO currencyDAO) {
        this.currencyDAO = currencyDAO;
    }

    public BigDecimal convertFromTo(String currencyTo) {
        //its doing Too much.
        return currencyDAO.getCurrency(currencyTo);
    }
}
