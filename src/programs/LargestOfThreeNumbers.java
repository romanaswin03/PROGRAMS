package programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestOfThreeNumbers {
    static void maxOfThreeNumber(int num1, int num2, int num3){
        int max = num1;
        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        System.out.println("Greatest of three number is : "+max);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter a number 2: ");
        int num2 = input.nextInt();
        System.out.println("Enter a number 3: ");
        int num3 = input.nextInt();
        maxOfThreeNumber(num1, num2, num3);
    }
}
