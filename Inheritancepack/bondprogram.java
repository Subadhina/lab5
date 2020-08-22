/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritancepack;
import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class bondprogram {
    public static void main(String[] args) {
        bond b=new bond();
        convertiblebond c=new convertiblebond();
        for(int i=0;i<6;i++)
        {
            int a;
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the choice 1 for bond (or) else enter 2 for convertiblebond ");
            a=obj.nextInt();
            switch(a)
            {
            case 1:
              b.display();
              break;
            case 2:
                c.display();
                break;
         }
        
    }
}
}
class bond
{
     void display()
    {
        System.out.println("BOND");
    }
}
class convertiblebond extends bond
{
    void display()
    {
        System.out.println("CONVERTIBLEBOND");
    }
}

