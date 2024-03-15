package programs;

import java.util.Scanner;

public class CheckEqualvaluesInTwoArray {
    static boolean checkEqualsOfArray(int[] arr1, int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of array1 : ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter a size of array2 : ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = input.nextInt();
        }
        if(checkEqualsOfArray(arr1,arr2)){
            System.out.println("Array is equal");
        }
        else{
            System.out.println("Array is not equal");
        }
    }
}
