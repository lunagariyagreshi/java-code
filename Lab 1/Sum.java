//Write a program to get 2 numbers from the user and print the sum of two numbers using command line and Scanner class

import java.util.*;
public class Sum{
    public static void main(String[] args){
        int a=Integer.parseInt(args[0]);              // to convert string into integer.****
        int b=Integer.parseInt(args[1]);
        int c = a+b;
        System.out.println("sum using command line="+c);
        //System.out.println(args[0]+args[1]);  <-- for direct sum of 2 numbers


        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        int z=x+y;
       System.out.println("sum using scanner class = "+z);
    }
}


