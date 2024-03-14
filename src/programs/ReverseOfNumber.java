package programs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = number.nextInt();
        int digit=0;
        int reverse = 0;
        int rem;

        while(num>0) {
            rem = num%10;
            num/=10;
            reverse = reverse*10 + rem;
        }
        System.out.println("Reverse of a digit is : " + reverse);
    }
}
