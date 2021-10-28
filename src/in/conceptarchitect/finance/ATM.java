package in.conceptarchitect.finance;

import java.util.Scanner;

public class ATM {
	
		private int accountNumber;

		private String password;

		private double amount;

		public int getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		Bank B=new Bank(accountNumber,password,amount);
			
		Scanner sc=new Scanner(System.in);
		
		public void withdraw(int accoutNumber,String Password,double amount) {
			B.withdraw(accoutNumber,Password,amount);
		}
		
		public void Deposit(int accountNumber,double amount) {
			B.Deposit(accountNumber,amount);
		}
		
		public void changePassword(String oldpassword, String newpassword) {
			B.changePassword(oldpassword, newpassword);
		}
//		public void options() {			
//			System.out.println("1 Account Details");
//		 
//			System.out.println("2 Withdraw");
//
//			System.out.println("3 Deposit");
//
//			while(true) {
//			int i=sc.nextInt();
//
//		      switch(i)
//
//		      {
//
//			 case 1:
//
//			BA.show();
//
//			break;
//
//			 case 2:
//			
//			BA.withdraw(10000, "kittu@");
//
//			break;
//			
//			 case 3:
//				 
//				 BA.deposit(10000);
//				break;
//	 
//
//			case 0:
//		        
//		         System.exit(0);
//
//			break;
//		      }
//
//		  }
//
//}

}
