//Write a program to find that given number is palindrome or not.

import java.util.*;
public class Palindrom{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n!=0){
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		if(temp==rev){
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}