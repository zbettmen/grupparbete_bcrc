package se.ecutb.grupparbeteVendingMachine;


import Model.*;

public class App
{   private static ImplementVendingMachine test2;
    public static void main( String[] args ){

        Product test = new Mat(50,"Kebab", "650", 1, "nasty stuff");
        Product testGodis = new Godis(25, "Toblerone", "1200", 2, "Nuts");
        Product testDricka = new Dricka(10, "Vatten","0", 3, "Water");


        Product[] array = { test, testGodis, testDricka};

        ImplementVendingMachine implement = new ImplementVendingMachine(array);
    }

}
