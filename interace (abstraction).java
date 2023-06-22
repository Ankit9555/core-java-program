/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
interface Shape
{
    void draw();
    void getarea();
}
class Circle implements Shape
{
    int r = 0;
    double pi = 3.14, ar = 0;
    @Override
    public void draw()
    {
        r = 5;
    }
    @Override
    public void getarea()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
}
class Rectangle extends Circle
{
    int l = 0, b = 0;
    double ar;
    public void draw()
    {
        super.draw();
        l = 6;
        b = 4;
    }
    public void getarea()
    {
        super.getarea();
        ar = l * b;
        System.out.println("Area of rectangle:"+ar);
    }
}
   class D
{
    public static void main(String[] args)
    {   
       
        
        Rectangle obj2 = new Rectangle();
        obj2.draw();
        obj2.getarea();
        
    }
}
	
	 
	
	   
	 
	     
	  
	  	
	  
