/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ValeriaFrolova
 */
public class Fibbonacci {
    public static void main (String[] args){
        int n1=0, n2=1;
        System.out.print (n1 + " " + n2);//output 0 and 1 values
    for (int n3=1; n3<=30000; n3=n1+n2 ) {
   //rewritten value is calculated and stored in n3
  System.out.print(" "+n3);    
  n1=n2;//n2 value is assigned to n1
  n2=n3;//n3 value is assigned to n2 and rewritten to further calculation-above
    }
  }
}