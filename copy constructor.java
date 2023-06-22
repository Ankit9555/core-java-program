/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class person{
  int a;
  int b;
  person()
  {
    a=45;
    b=46;
    System.out.println(a+" "+b);
    
     
  }
  person(person ref)  //copy constructor
  {
    a=ref.a;
    b=ref.b;
     System.out.println(a+" "+b);
  }
 
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		person p=new person();
		person p2=new person(p);  // copy constructor called
		 
	
		// your code goes here
	}
}
