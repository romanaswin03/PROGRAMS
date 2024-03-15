package programs;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
    static void sumOfArrays(int len){
        Scanner input = new Scanner(System.in);
        int arr[] = new int[len];
        System.out.println("Enter array values : ");
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            sum+=arr[i];

        }
        System.out.println("Sum of array is "+sum);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int sizeOfArray = input.nextInt();

        sumOfArrays(sizeOfArray);
        //System.out.println(Arrays.toString(arr));
    }
}
