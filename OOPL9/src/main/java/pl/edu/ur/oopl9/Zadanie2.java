/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Random;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class Zadanie2 {
    
        public static void main(String[] args) {
        
        Random losuj = new Random();
        TreeSet<Integer> liczby = new TreeSet<>();
        
        for(int i = 0;i<100;i++)
        {
           liczby.add(losuj.nextInt(101));
        }
        
        Iterator iterator = liczby.iterator();
        
        while(iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
       
}
}