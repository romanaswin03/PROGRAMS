package programs;

import java.util.Scanner;

public class ReverseEveryWordInString {
    static void reverseWordInString(String str){

        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            for (int j = word.length()-1; j >=0 ; j--) {
                reversedWord = reversedWord + word.charAt(j);
            }
            reversedString = reversedString + reversedWord + " ";
        }
        System.out.println(reversedString);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some words :");
        String str = input.nextLine();
        reverseWordInString(str);
    }
}
