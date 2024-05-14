/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project.practice7;
import java.util.Scanner;
/**
 *
 * @author MKAY
 */
public class PRACTICE7 {
/*A program that will ask the user to enter the amount of a purchase. The program 
should then compute the state and county sales tax. Assuming the state sales tax is 4 percent 
and the county sales tax is 2 percent. The program will display the amount of the purchase,
the state sales tax, the county sales tax, the total sales tax, and the total of the sale
(which is the sum of the amount of purchase plus the total sales tax)*/
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double amountOfPurchase; //will store amount of purchase without taxes
        double stateSalesTax; //considering tax is 4%
        double countySalesTax; //considering tax is 2%
        double totalSalesTax; 
        double totalOfSale; // total amount (to be) paid
        
        System.out.println("Amount of purchase: ");
        amountOfPurchase = keyboard.nextDouble();
        
        stateSalesTax = amountOfPurchase * 0.04;
        countySalesTax = amountOfPurchase * 0.02;
        totalSalesTax = stateSalesTax + countySalesTax;
        totalOfSale = totalSalesTax + amountOfPurchase;
        
        System.out.println("Amount Of purchase: " + amountOfPurchase);
        System.out.println("State Sales Tax: " + stateSalesTax);
        System.out.println("County Sales Tax: " + countySalesTax);
        System.out.println("Total Sales Tax: " + totalSalesTax);
        System.out.println("Total: " + totalOfSale);
        
       
    }
}
