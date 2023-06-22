/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
 class student
 {
   int roll, marks;
   String name;
   void input()
   {
      System.out.println("enter roll,marks and name");
   }
 }  
     
 class Ankit extends student
   {
   void display()
   {
      roll=196320017;
      marks=356;
      name="Ankit";
      System.out.println(roll);
      System.out.println(marks);
      System.out.println(name);
   }
   
   
  
  
      public static void main(String[] args)
      {
         Ankit a=new Ankit();
         a.input();
         a.display();
      
      
      }
   
    
   } 
    
 