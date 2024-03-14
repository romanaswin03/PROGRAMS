package programs;

import java.util.Scanner;

public class Palindrome {
    static boolean checkPalindrome(String str){
        String rev = "";
        int len = str.length();
        for (int i = len-1; i >=0 ; i--) {
            rev = rev + str.charAt(i);
        }
//        Method 1
//        if(str.equals(rev)){
//            System.out.println("Entered string is a palindrome ");
//        }
//        else {
//            System.out.println("Entered string is not a palindrome");
//        }
        //Method 2

        for (int i = 0; i < len; i++) {
            if(str.charAt(i)!=rev.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome : ");
        String str = input.next();
        if(checkPalindrome(str)){
            System.out.println("Entered string is Palindrome");
        }
        else {
            System.out.println("Entered string is not a palindrome");
        }
    }
}
