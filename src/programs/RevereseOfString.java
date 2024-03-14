package programs;

import java.util.Scanner;

public class RevereseOfString {
    static String ReverseString(String str){
        int len = str.length();
        String rev="";
        for(int i=len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to reverse : ");
        String str = input.next();

        System.out.println(ReverseString(str));

    }
}
