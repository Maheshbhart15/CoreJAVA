package Operators;

import java.util.Scanner;

public class ArithmaticOperators {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float result;

        System.out.println("Enter Num1, Num2 ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        result=num1+num2;
        System.out.println("ADD :"+result);

        result=num1-num2;
        System.out.println("SUB  :"+result);

        result=num1/num2;
        System.out.println("Division:"+result);

        result=num1*num2;
        System.out.println("Multiplation :"+result);

        result=num1%num2;
        System.out.println("MoD:"+result);

    }
}
