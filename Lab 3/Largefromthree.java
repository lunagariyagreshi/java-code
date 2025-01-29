 //Write a program to find maximum no from given 3 no.(without if-else).

import java.util.*;
public class Largefromthree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			System.out.println("enter the number");
			double a = sc.nextDouble();
			System.out.println("enter the number");
			double b = sc.nextDouble();
			System.out.println("enter the number");
			double c = sc.nextDouble();
			if((a)==(b)==(c)){
				System.out.println("same");
			} else {
		double ans = (a>b && a>c)?a:(b>c)?b:c;
		System.out.println("largest number is = "+ans);
	}
	}
}