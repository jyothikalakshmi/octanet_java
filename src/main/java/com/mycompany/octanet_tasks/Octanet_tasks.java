
package com.mycompany.octanet_tasks;

import java.util.*;
 class Atm{
     
     float balance;
   int  pin=1234 ;
   
   public void checkpin(){
   
  System.out.println("enter the pin");
  Scanner sc=new Scanner(System.in);
   int enteredpin=sc.nextInt();
   
   if(enteredpin==pin){
       menu();
   }
   else{
       System.out.println("enter the correct pin");
   }
 }
   public void menu(){
       System.out.println( "enter your choice");
       System.out.println("1.check balance");
       System.out.println("2.withdraw money");
           System.out.println("3.deposit money")         ;
              System.out.println("4.exit");
              Scanner s= new Scanner(System.in);
              int ch = s.nextInt();
             if(ch==1){
                 check_balance();
             }
             else if(ch==2){
                 withdraw();
             }
             else if(ch==3){
                 deposit();
             }
             else if(ch==4){
                 return;
             }
             else{
                 System.out.println("enter a valid choice");
             }       
 }
   public void check_balance(){
       System.out.println("balance:"+balance);
       menu();
   }
   public void withdraw(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the amount");
       float amount=sc.nextFloat();
       if(amount>balance){
           System.out.println("insufficient balance");
       }
       else{
           balance-=amount;
           System.out.println("money withdrawl successfull");
       }
       menu();
       }
   public void deposit(){
       System.out.println("enter amount");
       Scanner sc=new Scanner(System.in);
       float amt = sc.nextFloat();
       balance+=amt;
       System.out.println("money deposited succesfully\n");
       menu();
   }
  
//
//public void deposit(){
//System.out.println("enetr the amount");
//Scanner sc=new Scanner(System.in);
//float amt = sc.nextFloat();
//balance+=amount;
//}


 }
public class Octanet_tasks 
{
    public static void main(String[] args) {
      
        Atm obj=new Atm();
        obj.checkpin();
    }
}
