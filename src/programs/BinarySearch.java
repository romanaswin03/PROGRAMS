package programs;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] arr , int search){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(search == arr[mid]){
                return mid;
            }
            else if(search<arr[mid]){
                end=mid-1;
            }
            else if (search>arr[mid]) {
                start=mid+1;
            }
        }
        return-1;  //element not finded
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array values:  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter element to search : ");
        int search = input.nextInt();
        System.out.println("Element finded at "+binarySearch(arr,search));
        //output : -1 => ELement not founded
    }
}
