//Write a program that creates and initializes a four integer element array. Calculate and display the average of its values.

import java.util.*;
public class avg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total number ");
		int n=sc.nextInt();
		int a[] = new int[n];
		int sum=0;

		for(int i=0;i<a.length;i++){
			System.out.println("enter the number");
			 a[i]= sc.nextInt();
			sum+=a[i];
		}

		double avg=(double)sum/n;
		System.out.println("average = "+avg);
	}
} 
