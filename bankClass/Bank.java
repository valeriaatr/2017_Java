/*
 * This is a simple test for my Bank class
 */

/**
 *
 * @author ValeriaFrolova
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankClass acc1 = new BankClass();

        acc1.setAcc(10000, 5);
        acc1.updAcc(4500, 0.75);
        acc1.getAcc();
    }
}
