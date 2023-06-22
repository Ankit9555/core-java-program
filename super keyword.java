/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
 class A{
  int a=90;
  void sh()
  {
  System.out.println("super keyword called super class ");
  }
}
  class B extends A
  {
     int a=9;
    
     void show()
     {
        System.out.println(a);
     	super.sh();
    
     }
  }
 class student
 {
    public static void main (String[] args) throws java.lang.Exception
	{
		B p=new B(); 
		p.show();
	
	 
  }
}
 // accessable in same class not in other class 