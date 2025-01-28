//Write a program that reads a number in meters, converts it to feet, and displays the result

import java.util.*;
public class feetconvert{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value in meter");
		double a = sc.nextDouble();
		double ans = a*(0.305);
		System.out.println("ans in feet = "+ans);
	}
}