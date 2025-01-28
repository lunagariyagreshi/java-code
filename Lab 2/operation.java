//Write a program to create basic calculator by getting 2 numbers and 1 string (operation) from the user and apply the operation
// given in a string on the given numbers.

import java.util.*;
public class operation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter the sign");
        String op = sc.next();
        if(op.equals("+")){
            System.out.println("ans="+(a+b));
        } else if(op.equals("-")){
            System.out.println("ans="+(a-b));
        } else if(op.equals("*")){
            System.out.println("ans="+(a*b));
        } else if(op.equals("/")){
            System.out.println("ans="+(a/b));
        } else {
            System.out.println("Invalid ");
        }



    }
}