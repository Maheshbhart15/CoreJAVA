package Encapsulation.Emp;

import Encapsulation.Person.PersonInfo;

public class Empolyee {

    private  String Ename;
    private int Esal;

    public  Empolyee(String Ename,int Esal)
    {
        this.Ename=Ename;
        this.Esal=Esal;
    }

    public String getEname()
    {
        return Ename;
    }
    public int getEsal(){
        return  Esal;
    }

    public void setEname(String Ename) {
        this.Ename = Ename;
    }
    public void setEsal(int Esal){
        this.Esal=Esal;
    }

    public static class PersonInfoMain {
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
}
