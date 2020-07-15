//package org.codelab.currencyCalculator.services;

import java.math.BigDecimal;

/*
This file will get the data from the database,
a class wil implement this interface
 */
public interface DataProvider {

    BigDecimal getCurrency(String inputCurrency, String outputCurrency);
}
