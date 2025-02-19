// Define class for Complex number with real and imaginary as data members. Create its 
// constructor, overload the constructors. Also define addition method to add two 
// complex objects.

import java.util.*;

class complexNumber{

	int real;
	int complex;

	 public complexNumber(){
		real=0;
		complex=0;
	}

	public  complexNumber(int real,int complex){
		this.real=real;
		this.complex=complex;
	}

	// public void add(complexNumber c2){
	// 	this.real+=c2.real;
	// 	this.complex+=c2.complex;

	// 	System.out.println("addition is = "+this.real+"+"+this.complex+"i");
	// }

	public void add(int real,int complex){
		this.real+=real;
		this.complex+=complex;
		System.out.print("ddition is = "+this.real+"+"+this.complex+"i");
	}
}

public class complex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		complexNumber c1 = new complexNumber();

		System.out.println("Enter real no.");
		c1.real = sc.nextInt();
		System.out.println("Enter imaginary number");
		c1.complex=sc.nextInt();

		complexNumber c2 = new complexNumber();
	
		System.out.println("Enter real no.");
		c2.real = sc.nextInt();
		System.out.println("Enter imaginary number");
		c2.complex=sc.nextInt();

// c1.add(c2);
		c1.add(c2.real,c2.complex);


	}
}