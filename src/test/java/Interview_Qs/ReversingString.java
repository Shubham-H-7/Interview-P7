package Interview_Qs;

import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        System.out.println("Enter the string to be Reversed: ");
        Scanner scan = new Scanner(System.in);
        String x = scan.next();

        char[] y = x.toCharArray();
        int size = y.length;
        char [] a = new char[size];
        int i = 0;
        while (i!=size){
            a[size-1-i] = y[i];
            ++i;
        }
        System.out.println(a);
    }
}
