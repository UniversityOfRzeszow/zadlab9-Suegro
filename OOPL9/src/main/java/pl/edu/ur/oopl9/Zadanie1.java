/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author student
 */
public class Zadanie1 {
    
    Random losuj = new Random();
    int liczby[] = new int [100];
    
    public void losuj()
    {
        for(int i = 0;i<100;i++)
        {
            this.liczby[i] = losuj.nextInt(100);
        }    
    }
    
   public void sortuj()
   {
       Arrays.sort(liczby);
   }
        
   public void wynik()
   {
       for(int i = 0;i<100;i++)
       {
           System.out.print(liczby[i]+" ");
       }
   }
}
