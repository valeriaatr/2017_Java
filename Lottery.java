
import java.util.Scanner;

/*
 * A very simple Lottery class
 */

/**
 *
 * @author ValeriaFrolova
 */
public class Lottery {
     public static void main(String[] args) {
        // TODO code application logic here
        
    int num2, att=0, mon=0;
    int lottery = (int)(Math.random()*100);
    
    Scanner input = new Scanner(System.in); 
    System.out.println ("Input your number: ");
    
   for (num2 = input.nextInt (); ; num2 = input.nextInt ()){
    att++;//counting number of attempts after each cycle 
    if (num2 > lottery) {
        System.out.println ("Enter smaller number");
    }
    else if (num2<lottery) { 
        System.out.println ("Enter bigger number");
    }
    else {
        System.out.println ("Lottery number is " + lottery);
        System.out.println ("Made "+att+" attempts" );
          break;  } //end of cycle, number of attempts provided
    //end of the 1st for loop
   for (; att>1;mon=mon-1000){
        if (att==1){
            mon=mon+10000;
            System.out.println ("You have won 10 000$");
    }
        else if (mon<=1000 && mon>0){
            mon=mon-10;
            }}
    System.out.println ("Money won " + mon);
     }}}