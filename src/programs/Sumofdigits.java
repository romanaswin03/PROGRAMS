package programs;

import java.util.Scanner;

public class Sumofdigits {
    static void digitofaNumber(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of a digits in a number is : "+ sum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        digitofaNumber(num);
    }
}
