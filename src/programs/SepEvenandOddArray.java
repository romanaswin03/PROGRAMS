package programs;

import java.util.Arrays;
import java.util.Scanner;

public class SepEvenandOddArray {
    static void evenAndOddArray(int size){
        Scanner input = new Scanner(System.in);
        int evenArr[] = new int[size];
        int oddArr[] = new int[size];
        int arr[] = new int[size];
        System.out.println("Enter array values : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int x=0;
        int y=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                evenArr[x] = arr[i];
                x++;
            }
            else{
                oddArr[y] = arr[i];
                y++;
            }
        }
        System.out.print("Even Array is : ");
        for(int i=0; i<x; i++){
            System.out.print(" "+evenArr[i]);
        }
        System.out.println();
        System.out.print("Odd Array is : ");
        for(int i=0; i<y; i++){
            System.out.print(" "+oddArr[i]);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of array : ");
        int size = input.nextInt();
        evenAndOddArray(size);
    }
}
