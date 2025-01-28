//Write a program to convert temperature from Fahrenheit to Celsius.

import java.util.*;
public class tempconvert{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// feranhit to celcius convert

		System.out.println("enter the temp in f");
		double f = sc.nextDouble();
		double c = (9/5)*(f-32);
		System.out.println("ans in calcious = "+c);

       // celcius to feranhit convert

		System.out.println("enter the value in c");
		double a = sc.nextDouble();
		double ans = ((5/9)*(a))+32;
		System.out.println("ans in fernhit= "+ans);
	}
}