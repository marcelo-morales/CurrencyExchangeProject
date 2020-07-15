/*
This file connects to the postgres database named currency_exchange
 */



//package org.codelab.currencyCalculator.services;

import java.math.BigDecimal;
import java.sql.*;

//package com.postgresqltutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



class App {
    //you can construct the PostgreSQL JDBC connection string by using the following format:
    //jdbc:postgresql://<database_host>:<port>/<database_name>
    //this is specfic to each user
    private final String url = "jdbc:postgresql://MacBook-Pro.local/currency_exchange";
    private final String user = "marcelomorales";
    private final String password = "leonardo11";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        app.connect();
    }

}

public class DatabaseService {
    private CurrencyDAO currencyDAO;

    public void setCurrencyDAO(CurrencyDAO currencyDAO) {
        this.currencyDAO = currencyDAO;
    }

    //sets the current DAO
    public DatabaseService(CurrencyDAO currencyDAO) {
        this.currencyDAO = currencyDAO;
    }

    public BigDecimal convertFromTo(String currencyTo) {
        //its doing Too much.
        return currencyDAO.getCurrency(currencyTo);
    }
}





/*
import org.codelab.currencyCalculator.services.data.CurrencyDAO;


 *  id|currencyName|rate|timestamp
 *
 *  SELECT rate FROM CurrencyRates WHERE currencyName = "?" SORT BY timestamp
 *
 * Will connect to the database in this file
 * With JDBC. a database is represented by a URL


public class DatabaseService {
    private CurrencyDAO currencyDAO;

    public void setCurrencyDAO(CurrencyDAO currencyDAO) {
        this.currencyDAO = currencyDAO;
    }



    //sets the current
    public DatabaseService(CurrencyDAO currencyDAO) {
        this.currencyDAO = currencyDAO;
    }

    public BigDecimal convertFromTo(String currencyTo) {
        //its doing Too much.
        return currencyDAO.getCurrency(currencyTo);
    }
}



public  static void main (String [] args) {
    //you can construct the PostgreSQL JDBC connection string by using the following format:
    //jdbc:postgresql://<database_host>:<port>/<database_name>
    private final String url = "jdbc:postgresql://MacBook-Pro.local/currency_exchange";
    private final String user = "postgres";
    private final String password = "leonardo11";
    //To establish a connection to the PostgreSQL database server, you call the getConnection method of the DriverManager class. T
    // this method returns a Connection object.
    try {
        conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to the PostgreSQL server successfully.");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }

    return conn;


}



    try (Connection connection = DriverManager.getConnection("jdbc:postgresql:currency_exchange", "marcelo-morales", "leonardo11")) {

        System.out.println("Java JDBC PostgreSQL Example");
        // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within
        // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver");

        System.out.println("Connected to PostgreSQL database!");
        Statement statement = connection.createStatement();
        System.out.println("Reading car records...");
        System.out.printf("%-30.30s  %-30.30s%n", "Model", "Price");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM public.cars");
        while (resultSet.next()) {
            System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("model"), resultSet.getString("price"));
        }

    } /*catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
        System.out.println("Connection failure.");
        e.printStackTrace();
        }
   */