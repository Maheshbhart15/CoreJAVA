package Loops;

public class Pattern1 {

        public static void main(String[] args) {
            int rows = 4; // Number of rows in the pattern

            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = rows; j > i; j--) {
                    System.out.print("   ");
                }
                // Print asterisks and numbers
                for (int R = 2; R <= i; R++) {
                    if (R > 1) {
                        System.out.print(" ");
                        System.out.print("* ");
                    }
                }
                // Print the number
                System.out.print(i);
                // Print the trailing asterisks
                for (int l = 2; l <= i; l++) {
                    System.out.print(" *");
                }
                // Move to the next line
                System.out.println();
            }
        }
    }
