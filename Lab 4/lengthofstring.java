//Write a program to find length of string and print second half of the string.

import java.util.Scanner;
public class lengthofstring{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		System.out.println("enter string");
		String a = sc.next();
		int length=0;

		for(int i=0;i<a.length();i++){
			length++;
		}
		System.out.println("length of string is = "+length);

		System.out.print("second half of the string is = ");
		for(int i=(a.length()/2);i<a.length();i++){
			System.out.print(a.charAt(i));
		}


	}
}