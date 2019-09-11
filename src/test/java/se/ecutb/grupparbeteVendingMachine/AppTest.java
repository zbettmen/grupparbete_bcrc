package se.ecutb.grupparbeteVendingMachine;

import static org.junit.Assert.assertTrue;

import Model.*;
import org.junit.Before;
import org.junit.Test;


public class AppTest 
{

    @Before
    public void init()
    {
        Product test = new Mat(50,"Kebab", "650", 1, "nasty stuff");
        Product testGodis = new Godis(25, "Toblerone", "1200", 2, "Nuts");
        Product testDricka = new Dricka(10, "Vatten","0", 3, "Water");


        Product[] array = { test, testGodis, testDricka};

        ImplementVendingMachine implement = new ImplementVendingMachine(array);




    }
    @Test
    public void test_request(){
        int testProductnummber = 1;
        Product expected = 
    }
}
