package ClassAndComponet;

public class Instanceblock {
        // Instance variables
        int id;
        String name;

        // Instance initializer block
        {
            id = 1;
            name = "Default Name";
            System.out.println("Instance initializer block executed.");
        }

        // Constructor
        public Instanceblock() {
            System.out.println("Default constructor executed.");
        }

        // Constructor with parameters
        public Instanceblock(int id, String name) {
            this.id = id;
            this.name = name;
            System.out.println("Parameterized constructor executed.");
        }

        // Main method to test the class
        public static void main(String[] args) {
            Instanceblock obj1 = new Instanceblock(); // Both instance block and default constructor will be executed
            Instanceblock obj2 = new Instanceblock(2, "John Doe"); // Both instance block and parameterized constructor will be executed
        }
    }

