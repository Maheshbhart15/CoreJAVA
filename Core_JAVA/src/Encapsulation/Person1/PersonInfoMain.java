package Encapsulation.Person1;

import Encapsulation.Person1.PersonInfo;

public class PersonInfoMain {
    public static void main(String[] args) {
        // creting obj of public bit data private class

        PersonInfo person=new PersonInfo("Mahesh Bharati","8766532368","main road Latur ");


        System.out.println("name : "+ person.getname());
        System.out.println("Mob no :" + person.getMobno());
        System.out.println("Address : "+ person.getAddress());

        person.setName("");
        person.setMobno("");
        person.setAddress("");
    }
}
