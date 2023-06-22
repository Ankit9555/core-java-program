/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
 class A
 {
   int a,b,c;
  
   void add()
   { 
      a=15;
      b=54;
      c=a+b;
      System.out.println("Sum="+c);
   }
   void subs()
   {
      a=45;
      b=6;
      c=a-b;
      System.out.println("subs="+c);
   }
 }  
     
 class B extends  A
   {
   void mult()
   {
      a=12;
      b=6;
      c=a*b;
      System.out.println("mul="+c);
   }
   void div()
   {
      a=8;
      b=2;
      c=a/b;
      System.out.println("div="+c);
   }
   }
   class C extends B
   {
      void rem()
      {
         a=76;
         b=6;
         c=a%b;
         System.out.println("rem="+c);
      }
   }
   
  
  class test
  {
      public static void main(String[] args)
      {
         C a=new C();
         a.add();
         a.subs();
         a.mult();
         a.div();
         a.rem();
      
      
      }
   
    
   } 
    
 