//Write a program that prompts the user to enter three numbers. Find the largest number

import java.util.*;
public class largestfromthree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a");
		double a=sc.nextDouble();
		System.out.println("enter the b");
		double b=sc.nextDouble();
		System.out.println("enter the c");
		double c=sc.nextDouble();
		double ans = (a>b && a>c)?(a):(b>c)?b:c;
		System.out.println("largest number is = "+ans);
	}
}