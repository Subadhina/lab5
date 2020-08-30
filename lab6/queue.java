/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class queue {
    public static void main(String[] args) {
        myqueue q=new myqueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
    }
    
}
interface queueoperations{
    void dequeue();
    void display();
    
}
 class myqueue implements queueoperations 
{
    int rear,front,size=7;
    int que[]=new int[size];
    myqueue()
    {
     
      front=0;
      rear=0;
     
    }
    
     void enqueue(int a)
   {
      
       if(rear==size-1)
       {
           System.out.println("Queue is full");
           
       }
       else
       {
           que[rear]=a;
          rear=rear+1;
     
       }
    
      
   }
    
       
     public void dequeue()
       {
         if(front==0 && rear==0)
         {
             System.out.println("Queue is empty so deletion can't be done");
             
         }
         else
         {
             int i;
           System.out.println("The deleted element is: "+que[front]); 
             for( i=front;i<rear;i++)
             {
                    
                 que[i]=que[i+1];
         
             }
             rear--;
        
             
            }
       }
         public void display()
         {
          int i;
          System.out.println("The queue elements are:");
          for(i=front;i<rear;i++)
          {
              System.out.println(que[i]);
         }
         }
 }

