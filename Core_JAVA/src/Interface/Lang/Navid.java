package Interface.Lang;

public class Navid implements Cloneable{
    int sal ;
    String company;

    Navid(int sal1,String company1){
        this.sal=sal1;
        this.company=company1;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Navid navid=new Navid(3500,"TCS");

        Navid n1=(Navid) navid.clone();
        System.out.println("Sal n1 :"+n1.sal + "\n Name of company "+n1.company);
    }

}
