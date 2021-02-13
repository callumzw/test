package com.napier.sem;

import java.sql.ResultSet;
import java.sql.Statement;

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

    // All Cities by Popualtion in the World
    public static City citiesWorld()
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
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");;
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                String cnt = rset.getString("CountryCode");
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + cnt;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next())
                {
                    city.country = cntrset.getString("Name");
                }
                return city;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // All Cities by Population in x Continent
    public static City citiesCont(String continent)
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
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                String cnt = rset.getString("CountryCode");
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + cnt;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next())
                {
                    city.country = cntrset.getString("Name");
                }
                return city;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // All Cities by Population in x Region
    public static City citiesRegion(String region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE Region = '" + region + "'"
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                String cnt = rset.getString("CountryCode");
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + cnt;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next())
                {
                    city.country = cntrset.getString("Name");
                }
                return city;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // All Cities by Population in x Country
    public static City citiesCountry(String country)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE Country = '" + country + "'"
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                String cnt = rset.getString("CountryCode");
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + cnt;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next())
                {
                    city.country = cntrset.getString("Name");
                }
                return city;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    //  All Cities by Population in x District
    public static City citiesDistrict(String district)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE District = '" + district + "'"
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                String cnt = rset.getString("CountryCode");
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + cnt;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next())
                {
                    city.country = cntrset.getString("Name");
                }
                return city;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // Top x Cities by Population in the World
    public static City topCityWorld(int x)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "ORDER BY Population DESC"
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                String cnt = rset.getString("CountryCode");
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + cnt;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next())
                {
                    city.country = cntrset.getString("Name");
                }
                return city;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // Top x Cities by Population in x Continent
    public static City topCityCont(int x, String continent)
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
                            + "ORDER BY Population DESC"
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                String cnt = rset.getString("CountryCode");
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + cnt;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next())
                {
                    city.country = cntrset.getString("Name");
                }
                return city;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // Top x Cities by Population in x Region
    public static City topCityRegion(int x, String region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE Region = '" + region + "'"
                            + "ORDER BY Population DESC"
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                String cnt = rset.getString("CountryCode");
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + cnt;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next())
                {
                    city.country = cntrset.getString("Name");
                }
                return city;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // Top x Cities by Population in x Country
    public static City topCityCountry(int x, String country)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE Country = '" + country + "'"
                            + "ORDER BY Population DESC"
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                String cnt = rset.getString("CountryCode");
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + cnt;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next())
                {
                    city.country = cntrset.getString("Name");
                }
                return city;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    // Top x Cities by Populati0n in x District
    public static City topCityDistrict(int x, String district)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String citySelect =
                    "SELECT Name, CountryCode, District, Population "
                            + "FROM city "
                            + "WHERE District = '" + district + "'"
                            + "ORDER BY Population DESC"
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(citySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                City city = new City();
                city.name = rset.getString("Name");
                city.district = rset.getString("District");
                city.population = rset.getInt("Population");
                // Get Country Name
                String cnt = rset.getString("CountryCode");
                // Use Country Code on country database
                String countrySelect =
                        "SELECT Name "
                                + "FROM country "
                                + "WHERE Code = " + cnt;
                ResultSet cntrset = stmt.executeQuery(countrySelect);
                if (cntrset.next())
                {
                    city.country = cntrset.getString("Name");
                }
                return city;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    public static void displayCity(City city)
    {
        if (city != null)
        {
            System.out.println(
                    city.name + "\n"
                            + city.country + "\n"
                            + city.district + "\n"
                            + city.population + "\n");
        }
    }
}
