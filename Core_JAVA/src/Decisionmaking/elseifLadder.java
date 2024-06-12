package Decisionmaking;

import java.util.Scanner;

public class elseifLadder {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no to chech num is odd or even ");
        int num= scanner.nextInt();
        if(num==0)
        {
            System.out.println("Your enter num 0 :"+num);
        } else if (num%2==0) {
            System.out.println(" enetr num is even :" +num);

        }
        else {
            System.out.println("enter num is odd :"+num);
        }
    }
}
