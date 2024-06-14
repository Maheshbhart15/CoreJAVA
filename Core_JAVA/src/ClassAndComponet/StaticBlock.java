package ClassAndComponet;

public class StaticBlock {

    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }

    public static void main(String []args ) {
        System.out.println("main method");
        StaticBlock ref = new StaticBlock();
    }
}