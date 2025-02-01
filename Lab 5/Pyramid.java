//s 
//st 
//str 
//stre 
//strea 
//stream

import java.util.*;
public class Pyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String a = sc.next();
		for(int i=0;i<=5;i++){
			for(int j=0;j<=i;j++){
				System.out.print(a.charAt(j));
			}
			System.out.println();
		}
	}
}

