package Interface;

public class CarDeatils implements Car{

    public void print(int prize)
    {
        System.out.println("prize of car "+prize);
    }

    public static void main(String[] args) {
        CarDeatils carDeatils =new CarDeatils();
        carDeatils.print(9999);
        System.out.println("more");
    }
}
