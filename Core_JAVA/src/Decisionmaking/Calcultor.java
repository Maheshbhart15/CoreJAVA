package Decisionmaking;

import java.util.Scanner;

public class Calcultor {
    public static void main(String[] args) {
        System.out.println("Enter 2 num ");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        System.out.println("Enter opertor ");
        char operator=scanner.next().charAt(0);

        switch (operator)
        {
            case '+'-> System.out.println("Addtion :"+(num1+num2));
            case '-'-> System.out.println("Subtraction :"+(num1-num2));
            case '/'-> System.out.println(" Division :"+(num1/num2));
            case '*'-> System.out.println("Multipliaction :"+(num1*num2));
            case '%'-> System.out.println("Mod return reminder of two nums:"+(num1%num2));



        }
    }
}
