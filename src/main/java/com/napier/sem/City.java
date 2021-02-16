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
    public int population;

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
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            ArrayList<String> codes = new ArrayList<String>();
            String code;
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");;
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                code = rset.getString("CountryCode");
                cities.add(city);
                codes.add(code);
            }
            int i = 0;
            for (String countries : codes)
            {
                code = codes.get(i);
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + code;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next()) {
                    cities.get(i).country = cntrset.getString("Name");
                }
                i++;
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
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE Continent = '" + continent + "'"
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            ArrayList<String> codes = new ArrayList<String>();
            String code;
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");;
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                code = rset.getString("CountryCode");
                cities.add(city);
                codes.add(code);
            }
            int i = 0;
            for (String countries : codes)
            {
                code = codes.get(i);
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + code;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next()) {
                    cities.get(i).country = cntrset.getString("Name");
                }
                i++;
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
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE Region = '" + region + "' "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            ArrayList<String> codes = new ArrayList<String>();
            String code;
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");;
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                code = rset.getString("CountryCode");
                cities.add(city);
                codes.add(code);
            }
            int i = 0;
            for (String countries : codes)
            {
                code = codes.get(i);
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + code;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next()) {
                    cities.get(i).country = cntrset.getString("Name");
                }
                i++;
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
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE Country = '" + country + "' "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            ArrayList<String> codes = new ArrayList<String>();
            String code;
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");;
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                code = rset.getString("CountryCode");
                cities.add(city);
                codes.add(code);
            }
            int i = 0;
            for (String countries : codes)
            {
                code = codes.get(i);
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + code;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next()) {
                    cities.get(i).country = cntrset.getString("Name");
                }
                i++;
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
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE District = '" + district + "' "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            ArrayList<String> codes = new ArrayList<String>();
            String code;
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");;
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                code = rset.getString("CountryCode");
                cities.add(city);
                codes.add(code);
            }
            int i = 0;
            for (String countries : codes)
            {
                code = codes.get(i);
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + code;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next()) {
                    cities.get(i).country = cntrset.getString("Name");
                }
                i++;
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
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "ORDER BY Population DESC "
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            ArrayList<String> codes = new ArrayList<String>();
            String code;
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");;
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                code = rset.getString("CountryCode");
                cities.add(city);
                codes.add(code);
            }
            int i = 0;
            for (String countries : codes)
            {
                code = codes.get(i);
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + code;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next()) {
                    cities.get(i).country = cntrset.getString("Name");
                }
                i++;
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
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE Continent = '" + continent + "' "
                            + "ORDER BY Population DESC "
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            ArrayList<String> codes = new ArrayList<String>();
            String code;
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");;
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                code = rset.getString("CountryCode");
                cities.add(city);
                codes.add(code);
            }
            int i = 0;
            for (String countries : codes)
            {
                code = codes.get(i);
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + code;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next()) {
                    cities.get(i).country = cntrset.getString("Name");
                }
                i++;
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
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE Region = '" + region + "' "
                            + "ORDER BY Population DESC "
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            ArrayList<String> codes = new ArrayList<String>();
            String code;
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");;
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                code = rset.getString("CountryCode");
                cities.add(city);
                codes.add(code);
            }
            int i = 0;
            for (String countries : codes)
            {
                code = codes.get(i);
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + code;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next()) {
                    cities.get(i).country = cntrset.getString("Name");
                }
                i++;
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
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE Country = '" + country + "' "
                            + "ORDER BY Population DESC "
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            ArrayList<String> codes = new ArrayList<String>();
            String code;
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");;
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                code = rset.getString("CountryCode");
                cities.add(city);
                codes.add(code);
            }
            int i = 0;
            for (String countries : codes)
            {
                code = codes.get(i);
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + code;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next()) {
                    cities.get(i).country = cntrset.getString("Name");
                }
                i++;
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
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE District = '" + district + "' "
                            + "ORDER BY Population DESC "
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            ArrayList<City> cities = new ArrayList<City>();
            ArrayList<String> codes = new ArrayList<String>();
            String code;
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");;
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                code = rset.getString("CountryCode");
                cities.add(city);
                codes.add(code);
            }
            int i = 0;
            for (String countries : codes)
            {
                code = codes.get(i);
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + code;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next()) {
                    cities.get(i).country = cntrset.getString("Name");
                }
                i++;
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
        System.out.println(String.format("%-14s %-17s %-16s %-14s ", "Name", "Country", "District", "Population"));
        for (City city : cities)
        {
            String city_str =
                    String.format("%-8s %-14s %-17s %-16s %-14s %-10s",
                             city.name, city.country, city.district, city.population);
            System.out.println(city_str);

        }
    }
}
