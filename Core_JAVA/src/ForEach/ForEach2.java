package ForEach;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

public class ForEach2 {
    public static void main(String[] args) {
        List < String>names =new ArrayList<>();
        names.add("Ram");
        names.add("Sham");

        for(String name: names)
            System.out.println(name);
    }
}
