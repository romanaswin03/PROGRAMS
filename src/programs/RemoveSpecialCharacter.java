package programs;

import java.util.Scanner;

public class RemoveSpecialCharacter {
    static void removespecialchar(String str){
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122)){
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println(str2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = input.next();
        removespecialchar(str);
    }
}
