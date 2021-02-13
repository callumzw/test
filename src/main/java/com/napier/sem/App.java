package com.napier.sem;

import java.sql.*;

public class App {
    public static void main(String[] args) {

        // Create new Application
        App a = new App();

        // Connect to database
        Database.connect();



        // Disconnect from database
        Database.disconnect();


    }

}
