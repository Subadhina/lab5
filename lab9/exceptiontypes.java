/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author ELCOT
 */
public class exceptiontypes {
     public static void main(String[] args)
    {
       
        System.out.println("\nArithmatic Exception:");
       
        try
        {
           int x=10;
           int y=0;
           int k=x/y;
        }
        catch(Exception e)
        {
            System.out.println(e);        
        }
        System.out.println("================================================");
        System.out.println("\nArrayindexoutofbounds Exception:");
        
        try
        {
            int a[]={100,2000,333,4987,534,700,5467,3456};
            int b=a[22];
            System.out.println(b);
        }
         catch(Exception e)
        {
            System.out.println(e);        
        }
        System.out.println("================================================");
        System.out.println("\nNumberformat Exception:");
        
        try
        {
           String s="aaaaa";
           
            int c=Integer.parseInt(s);
            System.out.println(c);
        }
         catch(Exception e)
        {
            System.out.println(e);        
        }
        System.out.println("================================================");
        System.out.println("\nStringindexoutofbounds Exception:");
        
        String s=" Hello world program in java ";
        try
        {
            System.out.println(s.substring(6,50));
        }
        catch(Exception e)
        {
            System.out.println(e);        
        }
        
    }
}
    

