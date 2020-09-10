/**
 *
 * @author ValeriaFrolova
 */
public class BankClass {
    private double bal, rate;
    BankClass(){//constructor
        bal=rate=0;
    }
    void setAcc(double b, double r){
        this.bal=b;
        this.rate=r;
    }
    double getAcc(){
        System.out.println("Balance is: " + bal + "\n" + "Interest rate: " + rate);
        return bal;
    }
    String updAcc(double b, double r){
        this.bal=b;
        this.rate=r;
        String result = "Balance now is: "+ (b+b*r);
        System.out.println(result);
        return result;
    }
}
