package programs;

import java.util.Scanner;

public class MissingNuminArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = input.nextInt();
        int len=size+1;
        int sum = 0;
        int[] arr = new int[size];
        System.out.println("Enter array values : ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            sum+=arr[i];
        }
        int missedarray = (len*(len+1)/2)-sum;
        System.out.printf("Missing array is %d%n", missedarray);
    }
}
