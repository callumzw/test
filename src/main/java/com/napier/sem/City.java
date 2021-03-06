package com.napier.sem;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class City
{

    /**
     * City name
     */
    public String name;

    /**
     * City Country
     */
    public String country;

    /**
     * City District
     */
    public String district;

    /**
     * City population
     */
    public long population;

    /**
     *  Methods
     */

    // All Cities by Population in the World
    public static ArrayList<City> citiesWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city JOIN country ON city.CountryCode=country.Code "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            // Check one is returned
            while (rset.next()) {
                City city = new City();
                city.name = rset.getString("city.Name");
                city.country =rset.getString("country.Name");
                city.district = rset.getString("District");
                city.population = rset.getLong("city.Population");
                cities.add(city);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // All Cities by Population in x Continent
    public static ArrayList<City> citiesCont(String continent)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city JOIN country ON city.CountryCode=country.Code "
                            + "WHERE Continent = '" +continent+ "' "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            String code;
            // Check one is returned
            while (rset.next()) {
                City city = new City();
                city.name = rset.getString("city.Name");
                city.country =rset.getString("country.Name");
                city.district = rset.getString("District");
                city.population = rset.getLong("city.Population");
                cities.add(city);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // All Cities by Population in x Region
    public static ArrayList<City> citiesRegion(String region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city JOIN country ON city.CountryCode=country.Code "
                            + "WHERE Region = '" +region+ "' "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            String code;
            // Check one is returned
            while (rset.next()) {
                City city = new City();
                city.name = rset.getString("city.Name");
                city.country =rset.getString("country.Name");
                city.district = rset.getString("District");
                city.population = rset.getLong("city.Population");
                cities.add(city);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // All Cities by Population in x Country
    public static ArrayList<City> citiesCountry(String country)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city JOIN country ON city.CountryCode=country.Code "
                            + "WHERE country.Name = '" +country+ "' "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            String code;
            // Check one is returned
            while (rset.next()) {
                City city = new City();
                city.name = rset.getString("city.Name");
                city.country =rset.getString("country.Name");
                city.district = rset.getString("District");
                city.population = rset.getLong("city.Population");
                cities.add(city);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    //  All Cities by Population in x District
    public static ArrayList<City> citiesDistrict(String district)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city JOIN country ON city.CountryCode=country.Code "
                            + "WHERE District = '" +district+ "' "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            String code;
            // Check one is returned
            while (rset.next()) {
                City city = new City();
                city.name = rset.getString("city.Name");
                city.country =rset.getString("country.Name");
                city.district = rset.getString("District");
                city.population = rset.getLong("city.Population");
                cities.add(city);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // Top x Cities by Population in the World
    public static ArrayList<City> topCityWorld(int x)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city JOIN country ON city.CountryCode=country.Code "
                            + "ORDER BY city.Population DESC LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            String code;
            // Check one is returned
            while (rset.next()) {
                City city = new City();
                city.name = rset.getString("city.Name");
                city.country =rset.getString("country.Name");
                city.district = rset.getString("District");
                city.population = rset.getLong("city.Population");
                cities.add(city);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // Top x Cities by Population in x Continent
    public static ArrayList<City> topCityCont(int x, String continent)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city JOIN country ON city.CountryCode=country.Code "
                            + "WHERE Continent = '" +continent+ "' "
                            + "ORDER BY city.Population DESC LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            String code;
            // Check one is returned
            while (rset.next()) {
                City city = new City();
                city.name = rset.getString("city.Name");
                city.country =rset.getString("country.Name");
                city.district = rset.getString("District");
                city.population = rset.getLong("city.Population");
                cities.add(city);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // Top x Cities by Population in x Region
    public static ArrayList<City> topCityRegion(int x, String region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city JOIN country ON city.CountryCode=country.Code "
                            + "WHERE Region = '" +region+ "' "
                            + "ORDER BY city.Population DESC LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            String code;
            // Check one is returned
            while (rset.next()) {
                City city = new City();
                city.name = rset.getString("city.Name");
                city.country =rset.getString("country.Name");
                city.district = rset.getString("District");
                city.population = rset.getLong("city.Population");
                cities.add(city);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // Top x Cities by Population in x Country
    public static ArrayList<City> topCityCountry(int x, String country)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city JOIN country ON city.CountryCode=country.Code "
                            + "WHERE country.Name = '" +country+ "' "
                            + "ORDER BY city.Population DESC LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            String code;
            // Check one is returned
            while (rset.next()) {
                City city = new City();
                city.name = rset.getString("city.Name");
                city.country =rset.getString("country.Name");
                city.district = rset.getString("District");
                city.population = rset.getLong("city.Population");
                cities.add(city);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // Top x Cities by Population in x District
    public static ArrayList<City> topCityDistrict(int x, String district)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city JOIN country ON city.CountryCode=country.Code "
                            + "WHERE District = '" +district+ "' "
                            + "ORDER BY city.Population DESC LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            String code;
            // Check one is returned
            while (rset.next()) {
                City city = new City();
                city.name = rset.getString("city.Name");
                city.country =rset.getString("country.Name");
                city.district = rset.getString("District");
                city.population = rset.getLong("city.Population");
                cities.add(city);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    public static void displayCity(ArrayList<City> cities)
    {
        System.out.println(String.format("%-17s %-17s %-16s %-14s", "Name", "Country", "District", "Population"));
        for (City city : cities)
        {
            String city_str =
                    String.format("%-17s %-17s %-16s %-14s",
                             city.name, city.country, city.district, city.population);
            System.out.println(city_str);

        }
        System.out.println("\n");
    }
}
