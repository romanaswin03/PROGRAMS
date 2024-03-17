package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateArray {
    static void duplicateArray(String[] arr){
        ArrayList<String>duplicate = new ArrayList<>();
        System.out.print("Duplicate element is : ");
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j< arr.length; j++){
                if(arr[i].equals(arr[j])){
                    duplicate.add(arr[i]);
                }
            }
        }
        for (int i = 0; i < duplicate.size(); i++) {
            System.out.print(duplicate.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = input.nextInt();
        String[] arr = new String[size];
        System.out.println("Enter array values: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.next();
        }
        duplicateArray(arr);
    }
}
