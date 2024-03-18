package programs;

import java.util.Scanner;

public class OcuurenceOfAChar {
    static void occurence(String str, char ch){

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(ch+" occured" + " " +count + " times");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some words: ");
        String str = input.next();
        System.out.print("Enter a char to find its occurence: ");
        char ch = input.next().trim().charAt(0);
        occurence(str,ch);
    }
}
