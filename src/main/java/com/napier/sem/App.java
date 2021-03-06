package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
// This prints reports of Countires, Cities, Capitals and Populations.
public class App {
    public static void main(String[] args) {

        // Connect to database.
       Database.connect();

       Scanner input = new Scanner(System.in);
      // System.out.println("Top x countries in y Continent");
      // System.out.println("Enter x number of countries");
       //int x = Integer.parseInt(input.nextLine());
      // System.out.println("Enter x Continent");
       //String y = input.nextLine();

       ArrayList<Country> countries = Country.topCountryCont(5,"Africa");
       Country.displayCountry(countries);


        ArrayList<Capital> capitals = Capital.topCapitalRegion(5,"Eastern Asia");
        Capital.displayCapital(capitals);


       ArrayList<City> cities = City.topCityDistrict(5,"Zuid-Holland");
       City.displayCity(cities);

        System.out.println("Populations in Continents");
        ArrayList<Population> populations = Population.popContinent();
        Population.displayPopulation(populations);

        // Disconnect from database
        Database.disconnect();



    }

}
