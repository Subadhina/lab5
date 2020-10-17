/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class Integerlistgeneric {
    public static void main(String[] args) {
        Integer n[]={1,20,3,40,5,60,7,80,9};
        list<Integer> obj=new list<>(n);
        obj.oddcount();
        obj.findmax();
        obj.swap( n,0,1);
        
    }
    
}
class list<T>{
    T[] value;
    public list(T[] value){
        this.value=value;
        
    }
    public void oddcount(){
        int count=0;
        for(int i=0;i<value.length;i++){
          int v= (int) value[i];
          if(v%2!=0){
             count++; 
              
          }   
        }
        System.out.println("Total number of odd integers in the list is: "+count);
    }
    public void swap(T[] n,int g,int h){
        
         T t=n[g];
         n[g]=n[h];
         n[h]=t;
         System.out.println("The elements in an array after swaping the 0th and 1st position");
         for(int i=0;i<value.length;i++){
            System.out.print("  "+value[i]); 
         }
        
}
     public void findmax(){
         System.out.println("Enter the limit between in which the maximum element to be found");
        Scanner s=new Scanner(System.in);
        int f=s.nextInt();
        int l=s.nextInt();
        int max=(int)value[f];
        for(int i=f;i<=l;i++){
          int v= (int) value[i];
          if(v>max){
              max=v;
           
              
          }   
        }
     
        System.out.println("The maximum element between the given range is: "+max);
    }
     
     
}    
     

