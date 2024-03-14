package programs;

import java.util.Scanner;

public class Swap_number {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = number.nextInt();
        System.out.println("Enter second number : ");
        int b = number.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping First number is " + a + " " + "Second number is " + b);
    }
}
