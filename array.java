/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{  
	   int n,sum=0,max=-100009,min=100009;
	   Scanner s=new Scanner (System.in);
	   n=s.nextInt();
	   int arr[]=new int[n];
	   
	      for(int i=0;i<n;i++)
	      {
	       arr[i]=s.nextInt();
	       sum+=arr[i];
	       if(arr[i]>max)
	       {
	          max=arr[i];
	       }
	       if(arr[i]<min)
	       {
	          min=arr[i];
	       }
	      }
	   
	 for(int i=0;i<n;i++)
	 {
	    System.out.print(arr[i]+" ");
	    
	    
	 }
	 System.out.println(" ");
	 System.out.println(max);
	    System.out.println(min);
	 
	
	   
	 
	     
	  
	  	
	  
	}
}
