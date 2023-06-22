/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */

     

  class A implements Runnable
  
     
     {
        public void run()
        {
           for(int i=0;i<5;i++)
           {
              System.out.println("Ankit");
           }
        }
     }
  
  class B
  
{
   public static void main(String[] args)
   {
      A r=new A();
    
     Thread t=new Thread(r);
      t.start();
      for(int i=0;i<5;i++)
      {
          System.out.println("Anjali");
      }
   }
   
} 