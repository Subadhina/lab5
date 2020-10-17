/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author ELCOT
 */
public class sortingDescgeneric {
    public static void main(String[] args) {
        Integer n[]={10,20,30,40};
        sort<Integer> obj=new sort<>(n);
        obj.desc();
    }
} 

class sort<T>{
     T[] value;
     T t;
    public sort(T[] value){
        this.value=value;
        
    }
    public void desc(){
        int x,y;
        System.out.println("Before sorting the array elements are:");
        for(int i=0;i<value.length;i++){
            System.out.print(" "+value[i]);
        }
         System.out.println();
        for(int i=0;i<value.length;i++){
            for(int j=0;j<value.length;j++){
            x=(int)value[i];
            y=(int)value[j];
            if(x>y){
                t=value[i];
                value[i]=value[j];
                value[j]=t;
            }
            } 
        }
        System.out.println("After sorting in descendant order: ");
        for(int i=0;i<value.length;i++){
            System.out.print(" "+value[i]);
        }
    }
}
    

