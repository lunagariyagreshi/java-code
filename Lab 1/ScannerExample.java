// take input using scanner class

import java.util.Scanner;
public class ScannerExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        //System.out.print(a+b);   <- for sum
    }
}