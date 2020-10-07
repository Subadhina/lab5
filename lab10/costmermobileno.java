/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author ELCOT
 */
public class costmermobileno {
    public static void  main(String[] args) throws IOException, ClassNotFoundException{
        DataInputStream d=new DataInputStream(System.in);
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("customerdetails.txt"));
        int n=10;
        customer c[]=new customer[10];
        String name;           
        
        String mobno;
        for(int i=0;i<n;i++)
        {
            System.out.println("Customer name:");
            name=d.readLine(); 
            System.out.println("Customer mobile number:");                   
            mobno=d.readLine(); 
       
            c[i]=new customer(name,mobno);
            obj.writeObject(c[i]);
        }
        
        obj.close();
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("customerdetails.txt"));
        System.out.println("Enter the name");
        String s=d.readLine();
        int i=0;
       
        while(n>0)
        {
          
           
            if(obj1.readObject()!=s)
            {
             n--;
             i++;
            }
            
            System.out.println("CUSTOMER MOBILE NO: "+c[i].mobno);
            break;
            
         
        }
        
        obj1.close();      
        
    }
    
    
        
}

class customer implements Serializable     
{
    String name;
    
    String mobno;
    customer(String n,String m )
    {
        name=n;
        
        mobno=m;
        
    }
   
}

   


