package Week1_Additional_Problems;


public class Problem3 {
    public static void main(String[] args) {
        int bill = 1200;

        if (bill < 1000){
            bill -= (10/100)*bill;
            System.out.println("Final Amount to be Paid: "+bill);
        }

        else if (bill >= 500 && bill<=1000){
            bill -= (5/100)*bill;
            System.out.println("Final Amount to be Paid: "+bill);
        }

        else
            System.out.println("Final Amount to be Paid: "+bill);
    }
}
