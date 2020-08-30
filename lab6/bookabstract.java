/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;


/**
 *
 * @author ELCOT
 */
public class bookabstract {
    public static void main(String[] args) {
        mybook b[]=new mybook[4];
        double sum=0;
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the book "+(i+1)+" details:");
            b[i]=new mybook();
            b[i].setdetails();
            System.out.println("The title of the book is: "+b[i].title+"\n\n");
            sum=sum+b[i].price;
        }
        System.out.println("The total price of all the books is: Rs."+sum);
    }
    
}
abstract class book
{
    abstract void setdetails();
    abstract String gettitle();
     String title,author;
    double price;
}
class mybook extends book
{
    void setdetails()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the book title ,author and price respetively");
         title=obj.next();
         author=obj.next();
         price=obj.nextDouble();
        
    }
    String gettitle()
    {
        return title;
    }
    
}