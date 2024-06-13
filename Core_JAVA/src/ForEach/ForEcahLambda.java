import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEcahLambda {
    public static void main(String[] args) {
        // Example with List
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Using forEach loop with List
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Example with Set
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Using forEach loop with Set
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
