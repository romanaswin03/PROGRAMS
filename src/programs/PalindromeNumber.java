package programs;

import java.util.Scanner;

public class PalindromeNumber {
    static boolean checkPalindrome(int num) {
        int rem = 0;
        int rev = 0;
        int temp;
        temp = num;
        while(temp!=0){  //Reverse of number
            rem = temp%10;
            temp/=10;
            rev = rev*10 +rem;
        }
        return num==rev;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = input.nextInt();
        if(checkPalindrome(num)){
            System.out.println("Its a palindrome number");
        }
        else {
            System.out.println("Its not a palindrome number");
        }
    }
}
