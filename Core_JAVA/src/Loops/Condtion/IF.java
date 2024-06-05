package Loops.Condtion;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        // if only check condtion based on true statement of code will be excute
        // will try for odd even
        System.out.println("Enter num check even or odd ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            if (num / 2 == 0) {
                System.out.println("EVEN NUM");
            } else {
                System.out.println("ODD NUM");
            }
        } else {
            System.out.println("You enter num less then 0 or 0 ");
        }
    }

}
