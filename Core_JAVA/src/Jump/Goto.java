package Jump;

public class Goto {
    public static void main(String[] args) {

                int x = 0;

                if (x < 5) {
                    System.out.println("Before goto");
            goto label;
            // Unconditional jump to the label
                    System.out.println("After goto"); // This code won't be executed
                }

                System.out.println("End of program.");

                // Label declaration
                label:
                System.out.println("Inside label.");
            }
        }



