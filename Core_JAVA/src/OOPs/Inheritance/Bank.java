package OOPs.Inheritance;

public class Bank {
    private int Deposit;

    Bank(int Deposit) {
        this.Deposit = Deposit;

    }

    public void Display() {
        System.out.println("Deposit amount " + Deposit);
    }
}

