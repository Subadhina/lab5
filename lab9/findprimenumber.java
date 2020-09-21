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
public class findprimenumber {
    public static void main(String[] args) {
        
        findprimenumber obj=new findprimenumber();
        try
        {
          int a=Integer.parseInt(args[0]);
          int k=Integer.parseInt(args[1]);
          obj.checksign(a,k);
            
            try
            {
               
                obj.checkbig(a,k);
           
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            primeno p=new primeno();
            p.no(a,k);
            
        }
            
        catch (Exception e)
        {
            System.out.println(e);
            
        }
       
    }
        void checksign( int a,int b) throws signexception
        {
            if(a<0 || b<0)
                throw new signexception("invalid sign");
              
               
        }
        void checkbig(int a, int b) throws bigexception
        {
            while(b<a)
                throw new bigexception("second number is lesser than the first");
           
        }
    }
class signexception extends Exception
{
   
    signexception(String msg)
    {
      super(msg);  
        
    }
}
class bigexception extends Exception
{
    String mssg;
    bigexception(String msg)
    {
      mssg=msg;  
        
    }
    public String toString()
    {
       
        return mssg;
        
    }
}
class primeno
{
  
    void no(int a, int k)
    {
        while(a<k)
        {
            boolean flag=false;
        for(int i=2;i<a;i++)
            {
               if(a%i==0)
               {
                   flag=true;
                   break;
               }
          
                
            }
        if(flag==false )
        {
            System.out.println(a);
            
        }
        a++;
    }
    }
}
    

