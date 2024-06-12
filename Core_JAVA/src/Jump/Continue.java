package Jump;

public class Continue {
    public static void main(String[] args) {
        //The continue statement is used to skip
        // the remaining code in the loop's body and jump to the next iteration of the loop.
         // basically skip the given condion
        for (int i = 0; i <10; i++) {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
