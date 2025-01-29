//Write a program to check whether a number is even or odd.

import java.util.Scanner;
public class EvenAndOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		if((a%2)==0){
			System.out.println("even");
		} else {
			System.out.println("odd");
		}


		// without operatare

		System.out.println("enter the number");
		double b=sc.nextDouble();
		if(b&1==1){
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
	}
}