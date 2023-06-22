/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
	   int ch;
	    Scanner s2=new Scanner (System.in);
	    ch=s2.nextInt();
	   
	
	  System.out.println("press 1 : for addition "); 
	  System.out.println("press 1 : for substracting ");
	  System.out.println("press 1 : for multiplying ");
	  System.out.println("press 1 : for dividing ");
	 
	    System.out.println("enter the operands :");
	   int a,b,c;
	   
	  
	   a=s2.nextInt();
	   b=s2.nextInt();
	 switch(ch)
	 {
	    case 1: 
	       System.out.println(c=a+b);
	              break;
	       case 2: 
	          System.out.println(c=a-b);
	                   break;
	          case 3:
	             System.out.println(c=a*b);
	                      break;
	          case 4: 
	             System.out.println(c=a/b);
	                      break;
	             default :
	             System.out.println("Invalid number");
	             break;
	 }
	     
	  
	  	
	  
	}
}
