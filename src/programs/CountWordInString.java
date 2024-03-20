package programs;

import java.util.Scanner;

public class CountWordInString {
    static void wordscount(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==32){
                count+=1;
            }
        }
        count+=1;
        System.out.println("Count of word is "+count);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        wordscount(str);
    }
}
