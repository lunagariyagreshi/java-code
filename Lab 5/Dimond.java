//   * 
//  * * 
// * * * 
//  * * 
//   *


import java.util.*;
public class Dimond{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of lines you want ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=n-1;i>=1;i--){
			for(int j=0;j<=n-i+1;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}