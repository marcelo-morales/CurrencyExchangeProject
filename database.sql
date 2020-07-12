CREATE TABLE currency_exchange(
    id INTEGER PRIMARY KEY,
    currency_abbreviation TEXT NOT NULL,
    currency_name TEXT NOT NULL,
    rate FLOAT,
    date timestamp(6) /* parameter is the fractional seconds precision */
);