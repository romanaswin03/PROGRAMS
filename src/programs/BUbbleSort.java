package programs;

import java.util.Arrays;
import java.util.Scanner;

public class BUbbleSort {
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j=0; j< arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        bubbleSort(arr);
    }
}
