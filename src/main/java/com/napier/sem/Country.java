package com.napier.sem;


import java.sql.ResultSet;
import java.sql.Statement;

public class Country
{
    /**
     * Country Code
     */
    public String code;

    /**
     * Country name
     */
    public String name;

    /**
     * Country Continent
     */
    public String continent;

    /**
     * Country Region
     */
    public String region;


    /**
     * Country Population
     */
    public int population;

    /**
     * Country Capital
     */
    public String capital;


    /**
     *  Methods
     */

    // All countries by Population in World
    public static Country countriesWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String countrySelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(countrySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Country country = new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                // Get Capital City Name
                int cap = rset.getInt("Capital");
                // Use Capital ID on city database
                String capitalSelect =
                        "SELECT Name "
                                + "FROM city "
                                + "WHERE ID = " + cap;
                ResultSet caprset = stmt.executeQuery(capitalSelect);
                if (caprset.next())
                {
                    country.capital = caprset.getString("Name");
                }
                return country;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    // All countries by Population in x Continent
    public static Country countriesCont(String continent)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String countrySelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "WHERE Continent = '" + continent
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(countrySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Country country = new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                // Get Capital City Name
                int cap = rset.getInt("Capital");
                // Use Capital ID on city database
                String capitalSelect =
                        "SELECT Name "
                                + "FROM city "
                                + "WHERE ID = " + cap;
                ResultSet caprset = stmt.executeQuery(capitalSelect);
                if (caprset.next())
                {
                    country.capital = caprset.getString("Name");
                }
                return country;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    //  All Countries by Population in x Region
    public static Country countriesRegion(String region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String countrySelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "WHERE Region = '" + region + "'"
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(countrySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Country country = new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                // Get Capital City Name
                int cap = rset.getInt("Capital");
                // Use Capital ID on city database
                String capitalSelect =
                        "SELECT Name "
                                + "FROM city "
                                + "WHERE ID = " + cap;
                ResultSet caprset = stmt.executeQuery(capitalSelect);
                if (caprset.next())
                {
                    country.capital = caprset.getString("Name");
                }
                return country;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    // Top x countries in World
    public static Country topCountryWorld(int x)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String countrySelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "ORDER BY Population DESC"
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(countrySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Country country = new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                // Get Capital City Name
                int cap = rset.getInt("Capital");
                // Use Capital ID on city database
                String capitalSelect =
                        "SELECT Name "
                                + "FROM city "
                                + "WHERE ID = " + cap;
                ResultSet caprset = stmt.executeQuery(capitalSelect);
                if (caprset.next())
                {
                    country.capital = caprset.getString("Name");
                }
                return country;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    // Top x countries from y continent
    public static Country topCountryCont(int x, String continent)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String countrySelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "WHERE Continent = '" + continent
                            + "ORDER BY Population DESC"
                            + "LIMIT" + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(countrySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Country country = new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                // Get Capital City Name
                int cap = rset.getInt("Capital");
                // Use Capital ID on city database
                String capitalSelect =
                        "SELECT Name "
                                + "FROM city "
                                + "WHERE ID = " + cap;
                ResultSet caprset = stmt.executeQuery(capitalSelect);
                if (caprset.next())
                {
                    country.capital = caprset.getString("Name");
                }
                return country;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    // Top x countries in y region
    public static Country topCountryRegion(int x, String region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String countrySelect =
                    "SELECT Code, Name, Continent, Region, Population, Capital "
                            + "FROM country "
                            + "WHERE Region = '" + region + "'"
                            + "ORDER BY Population DESC"
                            + "LIMIT" + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(countrySelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Country country = new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");
                // Get Capital City Name
                int cap = rset.getInt("Capital");
                // Use Capital ID on city database
                String capitalSelect =
                        "SELECT Name "
                                + "FROM city "
                                + "WHERE ID = " + cap;
                ResultSet caprset = stmt.executeQuery(capitalSelect);
                if (caprset.next())
                {
                    country.capital = caprset.getString("Name");
                }
                return country;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    // Display country to console
    public static void displayCountry(Country country)
    {
        if (country != null)
        {
            System.out.println(
                    country.code + "\n"
                            + country.name + "\n"
                            + country.continent + "\n"
                            + country.region + "\n"
                            + country.population + "\n"
                            + country.capital + "\n");
        }
    }

}
