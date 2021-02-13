package com.napier.sem;

import java.sql.ResultSet;
import java.sql.Statement;

public class Capital {
    /**
     * City name
     */
    public String name;

    /**
     * City Country
     */
    public String country;

    /**
     * City population
     */
    public int population;

    /**
     * Methods
     */

    // All Capitals by Population in the World
    public static Capital capitalsWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String capitalSelect =
                    "SELECT Name, CountryCode, Population "
                            + "FROM city "
                            + "WHERE EXISTS(SELECT Capital FROM country)"
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(capitalSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Capital capital = new Capital();
                capital.name = rset.getString("Name");;
                capital.population = rset.getInt("Population");
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
                    capital.country = cntrset.getString("Name");
                }
                return capital;
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

    // All Capitals by Population in x Continent
    public static Capital capitalsCont(String continent)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String capitalSelect =
                    "SELECT Name, CountryCode, Population "
                            + "FROM city "
                            + "WHERE EXISTS(SELECT Capital FROM country) "
                            + "AND Continent = '" + continent + "'"
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(capitalSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Capital capital = new Capital();
                capital.name = rset.getString("Name");;
                capital.population = rset.getInt("Population");
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
                    capital.country = cntrset.getString("Name");
                }
                return capital;
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

    // All Capitals by Population in x Region
    public static Capital capitalsRegion(String region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String capitalSelect =
                    "SELECT Name, CountryCode, Population "
                            + "FROM city "
                            + "WHERE EXISTS(SELECT Capital FROM country) "
                            + "AND Region = '" + region + "'"
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(capitalSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Capital capital = new Capital();
                capital.name = rset.getString("Name");;
                capital.population = rset.getInt("Population");
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
                    capital.country = cntrset.getString("Name");
                }
                return capital;
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

    // Top x Capitals by Population in the World
    public static Capital topCapitalWorld(int x)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String capitalSelect =
                    "SELECT Name, CountryCode, Population "
                            + "FROM city "
                            + "WHERE EXISTS(SELECT Capital FROM country) "
                            + "ORDER BY Population DESC"
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(capitalSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Capital capital = new Capital();
                capital.name = rset.getString("Name");;
                capital.population = rset.getInt("Population");
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
                    capital.country = cntrset.getString("Name");
                }
                return capital;
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

    // Top x Capitals by Population in x Continent
    public static Capital topCapitalCont(int x,String continent)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String capitalSelect =
                    "SELECT Name, CountryCode, Population "
                            + "FROM city "
                            + "WHERE EXISTS(SELECT Capital FROM country) "
                            + "AND Continent = '" + continent + "'"
                            + "ORDER BY Population DESC"
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(capitalSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Capital capital = new Capital();
                capital.name = rset.getString("Name");;
                capital.population = rset.getInt("Population");
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
                    capital.country = cntrset.getString("Name");
                }
                return capital;
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

    // Top x Capitals by Population in x Region
    public static Capital topCapitalRegion(int x,String region)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = Database.getCon().createStatement();
            // Create string for SQL statement
            String capitalSelect =
                    "SELECT Name, CountryCode, Population "
                            + "FROM city "
                            + "WHERE EXISTS(SELECT Capital FROM country) "
                            + "AND Region = '" + region + "'"
                            + "ORDER BY Population DESC"
                            + "LIMIT " + x;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(capitalSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Capital capital = new Capital();
                capital.name = rset.getString("Name");;
                capital.population = rset.getInt("Population");
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
                    capital.country = cntrset.getString("Name");
                }
                return capital;
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

    public static void displayCapital(Capital capital)
    {
        if (capital != null)
        {
            System.out.println(
                    capital.name + "\n"
                            + capital.country + "\n"
                            + capital.population + "\n");
        }
    }
}
