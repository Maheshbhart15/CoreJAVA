package Decisionmaking;

import java.util.Scanner;

public class LeapYearIf {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the Year check for leep year \n ");
        int year= scanner.nextInt();


        if(year/4==0){
            if(year % 100 ==0 || year % 400 ==0)
            System.out.println("its leap year" +year);

        }else {
            System.out.println("its not leap year ");
        }


    }
}
