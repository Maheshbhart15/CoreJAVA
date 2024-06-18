package Encapsulation.Emp;

import Encapsulation.Emp.Empolyee;

public class EmpolyeeMain {
    public static void main(String[] args) {
        Empolyee emp=new Empolyee("Mahesh",1500);

        System.out.println("name :"+emp.getEname());
        System.out.println("Sal :" +emp.getEsal());

    }
}
