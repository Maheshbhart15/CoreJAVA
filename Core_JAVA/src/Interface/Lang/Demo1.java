package Interface.Lang;

public class Demo1 implements Cloneable {
    //clone() its create obj of clone obj1

    String course;
    int id;
    Demo1(int id1,String Coursename1)
    {
        this.course=Coursename1;
        this.id=id1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Demo1 demo1=new Demo1(111,"Java");

        Demo1 C1=(Demo1) demo1.clone();
        System.out.println("Name :"+C1.course +"  \n id :"+ C1.id);

    }
}
