// Create a class named Bank_Account with data memebers accountNo, userName, email, 
// accountType and accountBalance, Also create methods getAccountDetails() and 
// displayAccountDetails().

import java.util.*;

class Bank_Account{
	int accountNo;
	String userName;
	String email;
	String accountType;
	int accountBalance;

	public void getAccountDetails(){
	
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter accountNo. ");
	     this.accountNo=sc.nextInt();
	     System.out.println("Enter user name ");
	     this.userName=sc.next();
	     System.out.println("Enter email ");
	     this.email=sc.next();
	     System.out.println("enter accountType");
	     this.accountType=sc.next();
	     System.out.println("Enter account balance ");
	     this.accountBalance=sc.nextInt(); 
	}

	public void displayAccountDetails(){
		System.out.println("OUTPUT :-");
		System.out.print("accountNo = "+this.accountNo+" userName = "+this.userName+" email = "+this.email+" accountType = "+this.accountType+" accountBalance ="+this.accountBalance);
	}
}

public class AccountDemo{
	public static void main(String[] args){

		Bank_Account a = new Bank_Account();
	    a.getAccountDetails();
        a.displayAccountDetails();

	}
}