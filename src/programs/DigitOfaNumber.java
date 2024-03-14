package programs;

import java.util.Scanner;

public class DigitOfaNumber {
    static void digitofaNumber(int num ){
        int digit = 0;
        while(num!=0){
            digit+=1;
            num/=10;
        }
        System.out.println("Digit of a number is "+ digit);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = input.nextInt();
        digitofaNumber(num);
    }
}
