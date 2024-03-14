package programs;

import java.util.Scanner;

public class FibonacciSeries {
    static void fibonacciSeries(int num){
        int a=0;
        int b=1;
        System.out.print(a + " " + b + " ");
        int sum = 0;
        for (int i = 2; i <num; i++) {
            sum = a + b;
            a = b;
            b = sum;

            System.out.print(sum + " ");
        }
        System.out.println("Fibonacci value of number you have entered is "+ sum);
    }
   
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n element of fibonacci you want : ");
        int num = input.nextInt();

        fibonacciSeries(num);
    }
}
