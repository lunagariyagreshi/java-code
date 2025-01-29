//Write a program to accept a line and check how many consonants and vowels are there in line.

import java.util.*;
public class CountConsonantAndVowel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String a = sc.next();
		int cons=0,vowel=0;
		for(int i=0;i<a.length();i++){               
			char ch = a.charAt(i);            // to take one charactor
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
				vowel++;
			}
		    if(ch==' ') {
				continue;
			} else{
				cons++;
			}
		}
		System.out.println("consonants = "+cons+" vowels = "+vowel);
	}
}