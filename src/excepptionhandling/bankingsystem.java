package excepptionhandling;

class InsufficientBalance extends Exception {
    InsufficientBalance(String msg) {
        super(msg);
    }
}
 class bankingsystem {

    static double balance = 3000;
    static final double MIN_BAL = 500;
    static void deposit(double amt) {
        balance += amt;
        System.out.println("Deposit Successful. Balance = " + balance);
    }
    static void withdraw(double amt) throws InsufficientBalance {
        if (balance - amt < MIN_BAL)
            throw new InsufficientBalance(" Minimum balance ₹500 must remain!");

        balance -= amt;
        System.out.println("Withdrawal Successful. Balance = " + balance);
    }
    static void transfer(double amt) throws InsufficientBalance {
        if (balance - amt < MIN_BAL)
            throw new InsufficientBalance(" Not enough balance to transfer!");

        balance -= amt;
        System.out.println("Transfer Successful. Balance = " + balance);
    }

    public static void main(String[] args) {
        try {
            deposit(500);
            withdraw(2000);  
            withdraw(1200);  
        }
        catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues normally...");
    }
}