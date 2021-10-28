package in.conceptarchitect.financeapp;

import in.conceptarchitect.finance.ATM;
import in.conceptarchitect.finance.Bank;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank B=new Bank(22,"pa@ss",2000);

		ATM A=new ATM();
		
		A.withdraw(22,"p@ss",2000);
		A.Deposit(22, 3000);
		
		A.changePassword("p@ss","mohan@");
		
//		String password="p@ss";
//		BankAccount a1=new BankAccount(222, "Vivek",password, 50000, 12);
//		
//		System.out.println("1 Bank");
//		 
//		System.out.println("2 BankAccount");
//
//		System.out.println("3 ATM");
//
//		
//		int i=sc.nextInt();
//
//	      switch(i)
//
//	      {
//
//		 case 1:
//
//		
//	break;
//
//		 case 2:
//		
//		
//
//		break;
//		
//		 case 3:
//			 
//			 A.options();
//
//
//			break;
// 
//
//		case 0:
//	        
//	         System.exit(0);
//
//		break;
//	      }
		
		
	}

}
