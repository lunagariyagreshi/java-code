//Define Time class with constructor to initialize hour and minute. Also define addition method to add two time objects.


import java.util.*;
class Time{
	int hour;
	int minute;

	public void addTime(int hour,int minute){
		this.hour=hour;
		this.minute=minute;

		this.hour = this.hour+hour;
		this.minute= this.minute+minute;

		if(this.minute>59){
			this.hour++;
			this.minute=this.minute-60;
		} 
		if(this.hour>12){
			this.hour=this.hour-12;
			System.out.println("Hour = "+this.hour+"Min = "+this.minute);
		} else {
		System.out.println("Hour = "+this.hour+"Min = "+this.minute);
		}
	}
}

	public class timesum{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);

			Time t1 = new Time();

			System.out.print("Enter hour ");
			int h1=sc.nextInt();
			t1.hour=h1;                               // object.class name = variable

			System.out.print("Enter minute ");
			int m1=sc.nextInt();
			t1.minute=m1;


			Time t2 = new Time();

			System.out.print("Enter hour ");
			int h2 = sc.nextInt();
			t2.hour=h2;
			
			System.out.print("Enter minute ");
			int m2 = sc.nextInt();
			t2.minute=m2;
	
			t1.addTime(h2,m2);


		}

	
}