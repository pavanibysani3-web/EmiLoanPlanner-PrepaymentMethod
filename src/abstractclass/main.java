package abstractclass;
abstract class Loan {
    abstract void schedule();
}

class HomeLoan extends Loan {

    void schedule() {
        System.out.println("Home Loan Schedule: Monthly EMI for long-term repayment.");
    }
}

class EduLoan extends Loan {
    void schedule() {
        System.out.println("Education Loan Schedule: Moratorium + Flexible EMI structure.");
    }
}

public class main {
    public static void main(String[] args) {
        Loan home = new HomeLoan();
        Loan edu = new EduLoan();

        home.schedule();
        edu.schedule();
    }
}


