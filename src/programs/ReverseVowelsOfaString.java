package programs;

import java.util.Scanner;

//Example : str -> hello
// output -> holle

public class ReverseVowelsOfaString {
    static void reverseVowels(String str){
        String vowels = "";
        String reversed="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vowels+=str.charAt(i);
            }
        }
        for (int i = 0,j = vowels.length()-1; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                reversed += vowels.charAt(j);
                j--;
            }
            else {
                reversed += str.charAt(i);
            }
        }
        System.out.println("After reversing vowels in a string is : "+reversed);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        reverseVowels(str);
    }
}
