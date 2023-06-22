/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */

abstract class animal
 {
    void leg()
    {
       System.out.println("Animal have our legs");
    }
    abstract void sound( );
    abstract void eat();
      
 }  
     
 class dog extends animal
   {
  // @override
   void sound()
   {
      System.out.println("The dog is barking");
   }
  // @override
   void eat()
   {
      System.out.println("meat");
   }
   
   }
    class cow extends animal
   {
 //  @ override
   void sound()
   {
      System.out.println("The cow is aawahhh");
   }
  // @override
   void eat()
   {
      System.out.println("grass");
   }
   
   }
   class absclass
   {
      public static void main(String[] args)
      {
         dog d=new dog();
         cow c=new cow();
         d.sound();
         d.eat();
         d.leg();
         c.sound();
         c.eat();
         c.leg();
         
      }
      
      
      
      
      
      
      
      
      
      
   }
   
    
    
    
 