/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */

 class bank
 {
    private double bal=100000;
    private int pass=12345;
    int pwd;
    public void deposite(double a)
    {
       System.out.println("please ! Enter the passward");
       Scanner s=new Scanner (System.in);
       pwd=s.nextInt();
       if(pwd==12345)
       {
          bal=bal+a;
         System.out.println("your amount "+" "+a+" "+"is successfully deposit");
          System.out.println("Total Amount="+bal);
       }
       else
       {
          System.out.println("Incorrect Passward   plesase enter again !");
       }
          
    }
    public void withdraw(double b)
    {
       System.out.println("please ! Enter the passward");
       Scanner s1=new Scanner (System.in);
       pwd=s1.nextInt();
       if(pwd==12345)
       {
          bal=bal-b;
      System.out.println("your amount "+" "+b+" "+"is successfully withdrawn");
          System.out.println("Total Amount="+bal);
       }
       else
       {
          System.out.println("Incorrect Passward   plesase enter again !");
       }
          
    }
    public void checkbalance()
    {
       System.out.println("please ! Enter the passward");
       Scanner s2=new Scanner (System.in);
       pwd=s2.nextInt();
       if(pwd==12345)
       {
         
          System.out.println("Total Amount="+bal);
       }
       else
       {
          System.out.println("Incorrect Passward   plesase enter again !");
       }
          
    }
 }
 class customer
 {
   public static void main(String[]args) 
   {
   bank b=new bank();
   int ch;
   System.out.println("enter the operation you want to perform");
   System.out.println("press 1 : deposite ");
   System.out.println("press 2 :withdraw");
   System.out.println("press 3 : checkbalance");
   Scanner s3=new Scanner(System.in);
   ch=s3.nextInt();
   switch(ch)
   {
      case 1:b.deposite(10500);
      break;
      case 2:b.withdraw(50040);
      break;
      case 3:b.checkbalance();
      break;
      default: System.out.println("invalid choice");
   }
   
   }
   
    
    
    
 }