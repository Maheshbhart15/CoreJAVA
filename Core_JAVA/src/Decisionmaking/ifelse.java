package Decisionmaking;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        // if else is decision making  stament iin which 1st condtion chce based on that the code
        // excuted such as if true then true block is excuted
        // either else part

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no to check odd or even ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("odd num :"+num);
        }else {
            System.out.println("even num :"+num);
        }
    }
}
