package OOPs.Inheritance;

public class Main extends Bank{
        Main(int Deposit) {
            super(Deposit); // Calling SingleLevel's constructor with 'super'
        }

        public static void main(String[] args) {
            Bank bank=new Bank(20000);
            bank.Display();

        }

    }
