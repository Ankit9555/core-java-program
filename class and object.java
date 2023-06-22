/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class person{
   String name;
   int age;
   int  mn;
   void eat ( )
   {
      System.out.println("raM is eating ");
   }
   void sleep()
   {
    System.out.println("raM is sleeping ");  
   }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		person p=new person();
		 System.out.println(p.name);
		  System.out.println(p.mn);
		p.sleep();
		p.eat();
		// your code goes here
	}
}
