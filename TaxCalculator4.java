/*Assignment 1 - Tax Calculation
Author: Eithen O'Neil Student Number: L00162818
Date: 14/05/2021
Program to calculate tax based on a user's income and several other criteria
*/

import java.util.Scanner;

public class TaxCalculator4
{
   public static void main(String args[])
   {
      
      Scanner keyboardIn = new Scanner(System.in);
      
      
      // Add all variables needed for outputs and initialize them by making them = 0                     
      double income = 0;                
      double category = 0;
      double taxableincome = 0;
      double taxpayable = 0;
      double takehomepay = 0;
      char spouseworking = 0;
      double paidpercent = 0;
      
      //Get income input from user
      System.out.println("Welcome to the LYIT Tax Calculator");               
      System.out.println("Please enter your annual income:  ");
      income = keyboardIn.nextDouble();
      
      //Open if statement
      if (income < 5000)
      
      {
         System.out.print("Because you earn less than €5000, your tax bill is 0");
      }   
      
      
      //Get tax category from user and create a nested if statement
      else
         {
      
         System.out.println("Tax Categories: [1] Student part-time [2] Single full-time [3] Married full-time");
         System.out.println("Please enter your Tax Category");
      
         category = keyboardIn.nextDouble();


         if (category == 1)
     
         
            {
            System.out.println("Category 1 - Student part-time");
            //Here I created the calculations for the program to come up with the correct outputs
            taxableincome = income;
            taxpayable = taxableincome * .1; 
            takehomepay = income - taxpayable;
            paidpercent = taxpayable / income * 100;
            
            //Here I made seperate lines to display the information back to the user
            System.out.println("Annual income: "+income);
            System.out.println("Taxable income: "+taxableincome);
            System.out.println("Total tax payable: "+taxpayable);
            System.out.println("Take home pay: "+takehomepay);
            System.out.println("Your actual tax paid percentage is: "+paidpercent+ '%');
            }
      
         
      
         
          else if (category == 2)
        
         
            {
            System.out.println("Category 2 - Single full-time");
            taxableincome = income - 10000;
            taxpayable = taxableincome * .3;
            takehomepay = income - taxpayable;
            paidpercent = taxpayable / income * 100;
            
            System.out.println("Annual income: "+income);
            System.out.println("Taxable income: "+taxableincome);
            System.out.println("Total tax payable: "+taxpayable);
            System.out.println("Take home pay: "+takehomepay);
            System.out.println("Your actual tax paid percentage is: "+paidpercent+'%');
            }
         
         
         
         else if (category == 3)
         
         
            {
            System.out.println("Category 3 - Married Full Time");
            System.out.println("Does your spouse also work? [Y or N]: ");
            
           
            spouseworking = keyboardIn.next().charAt(0);
            
            
           //Here I created another nested if statement with Y in both Capital and lowercase for user accessibility.
            if (spouseworking == 'Y' || spouseworking == 'y')
             
            {   
            taxableincome = income - 20000;
            taxpayable = taxableincome * .25;
            takehomepay = income - taxpayable;
            paidpercent = taxpayable / income * 100;
            
            System.out.println("Annual income: "+income);
            System.out.println("Taxable income: "+taxableincome);
            System.out.println("Total tax payable: "+taxpayable);
            System.out.println("Take home pay: "+takehomepay);
            System.out.println("Your actual tax paid percentage is: "+paidpercent+'%');
            }
            
               
      
            if (spouseworking == 'N' || spouseworking == 'n')
            
            {   
            taxableincome = income - 30000;
            taxpayable = taxableincome * .25;
            takehomepay = income - taxpayable;
            paidpercent = taxpayable / income * 100;
            
            System.out.println("Annual income: "+income);
            System.out.println("Taxable income: "+taxableincome);
            System.out.println("Total tax payable: "+taxpayable);
            System.out.println("Take home pay: "+takehomepay);
            System.out.println("Your actual tax paid percentage is: "+paidpercent+'%');
            }
         }
      }
   }
}
            
            
            
      
   
   
         
      
         
      
   
         
                  

         
         
         
         
         
         
         
         
         
         

      
      
   

         
         