//Write a program to check that the given number is prime or not.

import java.util.*;
public class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			if((n%i)==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("Prime");
		} else {
			System.out.println("not prime");
		}

	}
}

// for(int i=2;i<n;i++){
// if(n%2==0){
// return;	
//}	else{
	//System.out.println("prime");
//}
//}