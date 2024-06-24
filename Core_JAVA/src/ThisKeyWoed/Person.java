package ThisKeyWoed;

public class Person {
    // this keyword is used to access  the instatance var , methods without create anoother obj
    // main method obj needed
    // static var ,method does not follow this  ref variable
    // also ot differnciate between local  and instantce method
    int id;
    String name;

    public void Display(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        Person person=new Person();
        person.Display(100,"this var");
        System.out.println(person.id+"id: \t"+person.name+"name :");
    }
}
