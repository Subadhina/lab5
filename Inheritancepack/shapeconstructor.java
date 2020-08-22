/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritancepack;

/**
 *
 * @author ELCOT
 */
public class shapeconstructor {
    public static void main(String[] args) {
        circle c=new circle();
        c.area();
        c.circumferance();
        square s=new square();
        s.area();
        s.lengthofdiagonal();
        sphere r=new sphere();
        r.surface();
        r.vol();
        
    }
    
}
class shape {
    double a,area,circum,length,surfacearea,volume;
   
    shape()
    {
      a=8.9;  
    }
}
class circle extends shape
{
    
    public void area()
    {
        System.out.println("CALCULATING AREA & CIRCUMFERANCE OF A CIRCLE\n");
        System.out.println("The radius is: "+a+" cm");
        area=Math.PI*(a*a);
        System.out.println("The area of a circle is:"+area+" square units");
    }
    public void circumferance()
    {
  
        circum=(2*Math.PI)*a;
        System.out.println("The circumfrance of a circle is:"+circum+" cm\n====================================");
    }
}
class square extends shape
{
    public void area()
    {
      System.out.println("CALCULATING AREA & DIAGONAL LENGTH OF A SQUARE\n");
      System.out.println("The side is: "+a+" cm");
       area=4*a;
       System.out.println("The area of a square is: "+area+" square units");
    }
    public void lengthofdiagonal()
    {
    
        length=1.414*a;
        System.out.println("The lengh of a diagonal is: "+length+" cm\n====================================");
        
    }
    
}
class sphere extends shape 
{
    public void surface()
    {
        System.out.println("CALCULATING SURFACE AREA &VOLUME OF A SPHERE\n");
        System.out.println("The radius is: "+a+" cm");
        surfacearea=4*(Math.PI*(a*a));
        System.out.println("The surface area of asphre is: "+surfacearea+" square units");
    }
    public void vol()
    {
     
        volume=(4/3)*(Math.PI*(a*a*a));
        System.out.println("the volume of a sphere is: "+volume+" cubic units");
    }
    
} 
   
            
