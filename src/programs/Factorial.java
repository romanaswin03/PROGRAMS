package programs;

import java.util.Scanner;

public class Factorial {

    static void factorial(int num){
        int sum=1;
        for(int i=1;i<=num; i++){
            sum=sum*i;
        }
        System.out.println("Factorial of " + num + " is" + " " + sum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        factorial(num);
    }
}
