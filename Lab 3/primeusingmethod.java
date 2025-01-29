
import java.util.*;

public class primeusingmethod{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting range ");
		int a = sc.nextInt();
		System.out.println("enter the last range ");
		int b = sc.nextInt();
		isPrime(a,b);

	}
	public static void isPrime( int a,int b){
		int count=0;
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