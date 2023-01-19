package Interview_Qs;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class SwapNum {

    public static void main(String[] args) {
        System.out.println("Enter the 1st number");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Enter the 2nd number");
        int y = scan.nextInt();
        System.out.println("1st Number is : "+ x);
        System.out.println("2nd Number is : "+ y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After swapping 1st Number: "+ x);
        System.out.println("After swapping 2nd Number: "+ y);
    }
}
