/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Dominik
 */


public class Zadanie4 {
    
    public static void main(String args[])
    {
        Scanner odczyt = new Scanner(System.in);
        String slowo;
        
        HashMap<String, String> slownik = new HashMap<>();
        slownik.put("jablko","apple");
        slownik.put("banan","banana");
        slownik.put("dom","home");
        slownik.put("kobieta","woman");
        slownik.put("czas","time");
        slownik.put("zegar","clock");
        slownik.put("rozumiec","grasp");
        slownik.put("zatajac","withhold");
        slownik.put("chwytac","seize");
        slownik.put("wyposazac","equip");
        slownik.put("promiec","radius");
        slownik.put("stlumic","stifle");
        slownik.put("naduzywac","abuse");
        slownik.put("zagrazac","menace");
        slownik.put("pogoda","weather");
        slownik.put("drzwi","door");
        slownik.put("zab","teeth");
        slownik.put("pies","dog");
        slownik.put("kot","cat");
        slownik.put("auto","car");
        
        while(true)
        {
            slowo = odczyt.next();
            if(slowo.equals("koniec!"))
                break;
          
                System.out.println(slownik.get(slowo));
            
        }
        
    }
    
    
    
}
