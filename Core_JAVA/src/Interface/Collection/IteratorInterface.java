package Interface.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterface {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("JAVA");
        names.add("PY");
        names.add("Docker");

        Iterator<String> itr = names.iterator();
        //Iterator is name of interface <string > values of string which is list type
        //iterator () function used to iterator from zero to last
        System.out.println("Printing names:");
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);

        }
    }
}