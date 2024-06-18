package Encapsulation;

public class PersonInfo {
    // Step 1: Make the data private
    private String name;
    private String Mobno;  // Mobno should be a String to hold phone numbers correctly
    private String Address;

    // Step 2: Create the constructor
    // Ensure the constructor initializes the fields correctly
    public PersonInfo(String name, String Mobno, String Address) {
        this.name = name;
        this.Mobno = Mobno;
        this.Address = Address;
    }

    // Step 3: Provide getter and setter methods

    // Public getter method for name
    public String getname() {
        return name;
    }

    // Public getter method for mobile number
    public String getMobno() {
        return Mobno;
    }

    // Public getter method for address
    public String getAddress() {
        return Address;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public setter method for mobile number
    public void setMobno(String Mobno) {
        this.Mobno = Mobno;
    }

    // Public setter method for address
    public void setAddress(String Address) {
        this.Address = Address;
    }

}
