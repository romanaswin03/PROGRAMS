package programs;

import java.util.Scanner;

public class MissingtwonuminArray {
    static int missingArray(int[] arr2,int size, int sum){
        int i;
        int j;
        int size2=arr2.length;
        int missedvalue=0;
        outerloop:
        for (i = 1; i < size2; i++) {
            innerloop:
            for(j=0; j<size2;j++){
                if(i==arr2[j]){
                    break innerloop;
                }
                else{
                    missedvalue = i;
                }

            }
        }
        return missedvalue;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = input.nextInt();
        int len = size+2;
        int[] arr = new int[size];
        int sum=0;
        int size2=arr.length+2;
        System.out.println("Enter array values: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            sum+=arr[i];
        }
        int sum2=(len*(len+1)/2);
        int totalofMissing = sum2-sum;
        int[] arr2 = new int[size2];
        arr2 = arr;
        int missingvalue = missingArray(arr2,size,sum);
        int secondmissing = totalofMissing-missingvalue;
        System.out.println("Missing value : "+missingvalue +" "+secondmissing);
    }
}
