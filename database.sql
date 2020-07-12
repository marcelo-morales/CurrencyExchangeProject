CREATE TABLE currency_exchange(
    id INTEGER PRIMARY KEY,
    currency_code TEXT NOT NULL,
    currency_name TEXT NOT NULL,
    currency_symbol TEXT NOT NULL,
    rate FLOAT,
    date timestamp(2) /* parameter is the fractional seconds precision */
);

/*
I think Chris we should use about 10 currencies, now just inserting initial
 data, going from one currency to same currency
 */
INSERT INTO currency_exchange
    (id, currency_code, currency_name, currency_symbol,  rate, "date")
    VALUES (1, "USD", "US DOLLAR", "$", 1.0, '2020-07-12 14:05:04.777');

INSERT INTO currency_exchange
    (id, currency_code, currency_name, currency_symbol, rate, "date")
    VALUES (2, "EUR", "EURO", "€", 1.0, '2020-07-12 14:06:07.777');

SELECT * FROM currency_exchange;