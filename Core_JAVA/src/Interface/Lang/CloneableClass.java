package Interface.Lang;

public class CloneableClass implements  Cloneable{


    int sal1;
    String name1;

    CloneableClass(int sal, String name)
    {
        this.name1=name;
         this.sal1=sal;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableClass cloneableClass=new CloneableClass(1000,"Navid");

        CloneableClass c1= (CloneableClass) cloneableClass.clone();
        System.out.println("Clone obj  printing Name :"+ c1.name1 +"\n"+"sal : " +c1.sal1);

    }
}
