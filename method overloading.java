/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
 class A
 {
   
  
   void add()
   { 
      int a=15;
      int b=54;
      int c=a+b;
      System.out.println("Sum="+c);
   }
   void add(int a,int b)
   {
     
      int c=a+b;
      System.out.println("Sum="+c);
   }
   void add(int a,double b)
   {
      double c=a+b;
      System.out.println("Sum="+c);
   }
  
     

  
      public static void main(String[] args)
      {
         A a=new A();
         a.add();
         a.add(15,54);
         a.add(15,54.5);
         
      
      
      }
   
    
   } 
    
 