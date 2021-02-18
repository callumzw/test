package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // Create new Application
        App a = new App();
        // Connect to database
       Database.connect();

       ArrayList<Country> countries = Country.topCountryCont(5,"South America");
       Country.displayCountry(countries);
       System.out.println("\n");

        ArrayList<Capital> capitals = Capital.topCapitalWorld(5);
        Capital.displayCapital(capitals);
        System.out.println("\n");

       ArrayList<City> cities = City.topCityCountry(5,"Japan");
       City.displayCity(cities);



        // Disconnect from database
        Database.disconnect();



    }

}
