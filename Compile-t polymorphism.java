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
 }
 class B extends A
 {
   // @ override
    void add()
    {
       int a=57;
       int b=98;
       int c=a+b;
       System.out.println("Sum="+c);
    }
 }
  
     

  class Demo
  {
      public static void main(String[] args)
      {
         B a=new B();
         a.add();
         
        
         
      
      
      }
   
    
   } 
    
 