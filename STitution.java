
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
public class STitution {
 public static void main(String[] args) {
        // TODO code application logic here
        double titution;
        double fee;
        double hour;
    Scanner input = new Scanner(System.in);

    String name;
System.out.print("User name is ");
    name = input.nextLine();
System.out.print ( name + "'s credit hours taken: " );
    hour = input.nextDouble();
System.out.print ("Student fee per hour ");
    fee = input.nextDouble();
 titution = fee * hour;
    System.out.println ( "Student " + name + " studies " + hour + " hours, and pays " + titution );
 }    
}
