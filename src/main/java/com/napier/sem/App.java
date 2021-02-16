package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // Create new Application
        App a = new App();
        // Connect to database
       Database.connect();

       ArrayList<Country> countries = Country.topCountryCont(10,"South America");
       Country.displayCountry(countries);

        // Disconnect from database
        Database.disconnect();



    }

}
