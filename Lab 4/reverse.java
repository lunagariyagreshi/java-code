// Write a program to print given array in reverse order.

import java.util.Scanner;
public class reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of array");
		  int n=sc.nextInt();
		  int a[] = new int[n];
		
		for(int i=0;i<n;i++){
			System.out.println("enter the element");
			a[i] = sc.nextInt();
		}

		System.out.print("reverse array is = ");
		for(int i=n-1;i>=0;i--){
			System.out.print(a[i]);
		}
	}
}