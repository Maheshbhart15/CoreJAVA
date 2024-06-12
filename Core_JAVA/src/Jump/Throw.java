package Jump;

public class Throw {
    public static void main(String[] args) {
        //The throw statement is used to explicitly throw an exception.
        // It is typically used when an exceptional condition occurs that
        // prevents the normal flow of the program.
        int value=-1;
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }

    }
}
