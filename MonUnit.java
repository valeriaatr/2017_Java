
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class MonUnit {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
float amount;
int cent, quarter, dime, nickel, penny, dollar, rem; 
        System.out.println ("Insert amount to convert: ");
    amount = input.nextFloat();
        amount = amount * 100;
        cent = (int)amount;
        dollar = cent/100;
            rem = cent%100;
        quarter = rem/25;
            rem = rem%25;
        dime = rem/10;
            rem = rem%10;
        nickel = rem/5;
        rem = rem%5;
        penny = rem/1;
    System.out.println ("Dollars: " + dollar + "; Quarters: " + quarter
            + "; Dimes: " + dime + "; Nickels: " + nickel + "; Pennies: " +
            penny);
    }
    
}
