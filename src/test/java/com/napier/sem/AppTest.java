package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static Country country;

    @BeforeAll
    static void init()
    {
        country = new Country();
    }

    @Test
    void printSalariesTestNull()
    {
        country.displayCountry(null);
    }
}