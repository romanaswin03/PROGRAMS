package programs;

import java.util.Scanner;

public class PrimeNumber {
    static void primeCheck(int num){
        if(num==1 ){
            System.out.println("Not a prime number");
        }
        if(num==2 || num==3) {
            System.out.println("Prime number ");
        }
        else{
            if(num%2==0 || num%3==0){
                System.out.println("Not a prime number");
            }
            else{
                System.out.println("Prime number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int num = input.nextInt();
        primeCheck(num);
    }
}

