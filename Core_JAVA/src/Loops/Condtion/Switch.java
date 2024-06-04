package Loops.Condtion;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter pin");
        int pin= scanner.nextInt();
        int key=123;
        while (pin==key)
        {
            System.out.println("Enter opt 1.ADD 2.WithDraw , 3.Check bal 4.exit ");
            int num1= scanner.nextInt();
            float bal=500;
            switch (num1) {
                case 1:
                    System.out.println("Enter amount you add ");
                    int add = scanner.nextInt();
                    bal = bal + add;
                    System.out.println(bal);
                    break;

                case 2:
                    System.out.println("Enter amount you want with draw ");
                    int sub= scanner.nextInt();
                    bal=bal-sub;
                    System.out.println("Remaining bal"+bal);
                    break;
                case 3:
                    System.out.println("Total Bal "+bal);
                    break;

                default:
                    System.out.println("Wrong choice or exit ");
            }

            }

        }
    }

