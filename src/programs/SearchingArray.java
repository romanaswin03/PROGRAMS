package programs;

import java.util.Scanner;

public class SearchingArray {
    static void arraySearching(int[] arr,int search){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search){
                System.out.println("Searched element found at index"+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array value: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println();
        System.out.print("Enter search element: ");
        int search = input.nextInt();
        arraySearching(arr,search);
    }
}
