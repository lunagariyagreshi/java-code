// Write a program to print prime numbers between given range. *************MIMP IN INTERVIEW        


import java.util.*;
public class Primeinrange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting range ");
		int a = sc.nextInt();
		System.out.println("enter the last range ");
		int b = sc.nextInt();
		int count=0;


		// for(int i=a;i<=b;i++){
         // int temp
      // for(int j=2;j<temp;j++){
         // if((temp%j)==0){
            //count++;
         // }
     //}
    // if(count==0){
        //System.out.println(temp);
      //}
 // count=0;
    // }

		for(int i=a;i<=b;i++){
			for(int j=2;j<a;j++){
				if(i%j==0){
					count++;
				} 
			}
			if(count==0){
				System.out.println(i);
			}
			count=0;
		}
	}
}