package Interview_Qs;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter the 1st String");
        Scanner scan = new Scanner(System.in);
        String x = scan.next();
        System.out.println("Enter the 2nd String");
        String y = scan.next();
        String temp ="";
        System.out.println("Before swapping x: "+ x +" & "+ " y: "+ y +" .");

        temp = x;
        x = y;
        y= temp;
        System.out.println("After swapping x: "+ x);
        System.out.println("After swapping y: "+ y);
    }
}
