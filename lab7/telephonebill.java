/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class telephonebill {
    public static void main(String[] args) {
        ArrayList<Double>l=new ArrayList<Double>(); //creating an arraylist

        System.out.println("Enter the telephone bill amount for 12 months one by one:");
        for(int i=0;i<12;i++)
        {
            Scanner obj=new Scanner(System.in); //Getting the input values
            double v=obj.nextDouble();
            l.add(v);
        }
         System.out.println(l);
         double sum=0,avg;
       for(int i=0;i<12;i++)     //finding the average amount
       {
          sum=sum+l.get(i);
       }
       System.out.println("The average amount is: Rs."+(sum/12));                 
        
        
       double min=l.get(0);
       for(int i=1;i<12;i++)
       {                          //finding the minimum amount
           if(min>l.get(i))
               min=l.get(i);
       }
       System.out.println("The minimum amount is: Rs."+min);                 
        double max=l.get(0);
       for(int i=1;i<12;i++)
       {
           if(max<l.get(i))
               max=l.get(i);   //finding the maximum amount
       }
       System.out.println("The minimum amount is: Rs."+max);                 
        
        
        
        
        
    }
    
}
