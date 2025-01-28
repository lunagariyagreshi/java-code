//Write a program that prompts the user to enter a letter and check whether a letter is a vowel or a constant.


import java.util.*;
public class count{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the letter");
		String letter = sc.nextLine();
		if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
			System.out.println("vowel");
		} else{
			System.out.println("consonant");
		}
		

	}
}