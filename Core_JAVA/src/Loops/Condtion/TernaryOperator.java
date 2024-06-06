package Loops.Condtion;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // comdtion ? true : false
        System.out.println("Enter Age for voting");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        System.out.println((num>=18)?"Eligiable for voting ": " Not Eligible for voting ");
    }
}
