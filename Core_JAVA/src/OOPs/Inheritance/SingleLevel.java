
package OOPs.Inheritance;

// Parent class
class SingleLevel {
    int sal;

    // Constructor of SingleLevel class
    SingleLevel(int sal) {
        this.sal = sal;
    }

    void display() {
        System.out.println("Salary of emp: " + sal);
    }
}

// Child class inheriting from SingleLevel
class Display extends SingleLevel {

    // Constructor of Display class
    Display(int sal) {
        super(sal); // Calling SingleLevel's constructor with 'super'
    }

    public static void main(String[] args) {
        Display display1 = new Display(5000); // Creating an object of Display (child) class
        display1.display(); // Calling display method inherited from SingleLevel class
    }
}

