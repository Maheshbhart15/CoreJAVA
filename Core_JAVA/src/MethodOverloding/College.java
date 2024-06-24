package MethodOverloding;
// when class have multiple methods with same name nut differnt singnature or paramertes

public class College {

    public void Class(String TE,String BE ,String FY )
    {
        System.out.println("FY" +FY +"TE "+TE+"BE"+BE);
    }
    public void Class(String FY, String SY ,String TE,String BE )
    {
        System.out.println("FY" +FY +"SY"+SY +"TE"+TE+"BE"+BE);
    }

    public static void main(String[] args) {
        College college=new College();
        college.Class("te","BE","Eeree");
        college.Class("te","BE","Eeree","BE");

    }
}
