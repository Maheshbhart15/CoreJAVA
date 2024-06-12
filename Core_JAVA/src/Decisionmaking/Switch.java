package Decisionmaking;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter your grade ");
        Scanner scanner=new Scanner(System.in);
        char grade = scanner.next().charAt(0);


        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("You passed.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

    }
}
