package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	int i=-1;
    	List<Account> acc = new ArrayList<Account>();
    	while(true) {
    System.out.println("----Welcome to AMS----");
    System.out.println("Press the index no. for that operation");
    System.out.println("0 - Open New Account\n"
    		+ "1 - Close an existing account\n"
    		+ "2 - Login to specific account using acc no.\n"
    		+ "3 - Specify the interest rate (for savings acc only)\n"
    		+ "4 - Display all account details\n"
    		+ "5 - Display all account deductions (including details)\n"
    		+ "6 - Deposit Money\n"
    		+ "7 - Withdraw Money\n"
    		+ "8 - See Bank Statement\n"
    		+ "9 - Calculate Zakat\n"
    		+ "10 - Transfer Money\n"
    		+ "11 - Exit");
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your choice: ");
    int input = scanner.nextInt();
    if(input == 0) {
    	 //Account acc = new Account();
    	
    	 i++;
    	 System.out.println("-----Customer Info----");
    	 System.out.println("Enter your name\n");
    	 String name = scanner.next();
    	 System.out.print("Enter you address\n");
    	 String address = scanner.next();
    	 System.out.print("Enter you phone no.\n");
    	 String phone_no = scanner.next();
    	 System.out.print("What type of account do you want(checking/savings)\n");
    	 String acc_type = scanner.next();
   	
    	 acc.add(new Account(name,address, phone_no,acc_type));
    	 System.out.print("-------------"+i+"----------");

    }
    
    else if(input == 1) {
    	
		System.out.print("You can't close an account right now...Come back later");

    }
    else if(input == 2) {
		System.out.print("---Login---"+"\nEnter your account number");
		String a_no = scanner.next();

		for(int j=0;j<=i;j++) {
			System.out.print("aa = "+acc.get(j).account_no+"\n a_no = "+a_no);

			if( Integer.parseInt(acc.get(j).account_no)  == Integer.parseInt(a_no)) {

				i=j;
				System.out.print(acc.get(i).obj.get(i).name+"Logged in \n");

				 
			}
		}

    	
    }
    
    else if(input == 3)//Specify the interest rate (for savings acc only)
    	{
    	if(acc.get(i).acc_type == "savings")
    	{
    		System.out.print("Specify the interest rate\n");
       	 acc.get(i).interest = scanner.nextDouble();
    		
    	}
    	
    	
    	
    }
      
    else if(input == 4)//Display all account details
	{
	    System.out.println(i);

	acc.get(i).displayalldetails();
	
}
  
    else if(input == 5)//Display all account deductions 
	{
	
	acc.get(i).displayalldetails();
	acc.get(i).displayAllDeductions();
	
	
}
 
else if(input == 6) {
    	
	System.out.print("Enter the amount you want to deposit\n");
	 double dep = scanner.nextDouble();
	acc.get(i).makeDeposit(dep);

    }
    
else if(input == 7) {
	System.out.print("Enter the amount you want to withdraw\n");
	 double wit = scanner.nextDouble();
	acc.get(i).makeWithdrawal(wit);
}

else if(input == 8) {
	acc.get(i).printStatement();
}

else if(input == 9) {
	acc.get(i).calculateZakat();
	
}

else if(input == 10) {
	System.out.println("----Transfer Money----");
    System.out.println("Enter the account number in which you want to send money\n");
    String opt = scanner.next();
    System.out.println("Enter the amount you want to send\n");
    double amt = scanner.nextInt();
    for(int j=0;j<=i;j++) {
        System.out.println("Enter = "+acc.get(j).account_no+"\nbc = "+opt);

    	if( Integer.parseInt(acc.get(j).account_no) == Integer.parseInt(opt)) {
			acc.get(j).makeDeposit(amt);
			acc.get(i).makeWithdrawal(amt);
		    System.out.println("Amount Sent\n");

    	}
    }
	
}
else if(input == 11) {
    System.out.println("Exited\n");

	System.exit(0);
}
    
  
    
    }
    
    
    
    
 
    }
}
