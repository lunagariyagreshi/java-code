//The marks obtained by a student in 5 different subjects are input through the keyboard.  
//The student gets a division as per the following rules: 
//I. Percentage above or equals to 60-first division 
//II. Percentage between 50 to 59-second division 
//III. Percentage between 40 and 49-Third division 
//IV. Percentage less than 40-fail 
//Write a program to calculate the division obtained by the student.


import java.util.Scanner;
public class Marks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double sum=0;
		double per=0;
			for(int i=0;i<5;i++){
			System.out.println("enter marks ");
			double mark = sc.nextDouble();
			sum = sum + mark;
		}
		per = (sum/5);

		if(per>=60){
			System.out.println("First division");
		} else if(per>=50 && per<=59){
			System.out.println("Second division");
		} else if(40<=per && per<=49){
			System.out.println("Third division");
    	}else if(per<40){
			System.out.println("Fail");
        }
    }
}