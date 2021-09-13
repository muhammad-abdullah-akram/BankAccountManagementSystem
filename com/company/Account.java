package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Account {
    Scanner scanner = new Scanner(System.in);
int i=-1;
	double balance;
	String account_no;
	String statement;
	String deductions;
	String acc_type;
	double interest;
	List<customer> obj = new ArrayList<customer>();
	
	Account(){
		// Random randomGenerator = new Random();
		balance = 0;
		account_no = " ";
		statement = " ";
		deductions = " ";
		acc_type = " "; 
		interest = 0;
		
		
		
	}
	
	Account(String name,String address,String phone_no,String acc_typ){
		
		i++;
		Random randomGenerator = new Random();
		statement = " ";
		deductions = " ";
		//obj.get(i) = new customer();
		obj.add(new customer(name,address,phone_no));
		account_no = Integer.toString(randomGenerator.nextInt(10000));
	//	obj.get(i).name = name;
	//	obj.get(i).address = address;
	//	obj.get(i).phone_no = phone_no;
		acc_type = acc_typ;
		interest = 0;
	    System.out.println("\nYour Account number is "+account_no);


	
	}
	
	 void makeDeposit(double dep) {
		    System.out.println("----Deposit----");
		    balance = balance+dep;
		    System.out.println(balance);
		    System.out.println("Amount added"+dep);
		    System.out.println("Current Balance"+balance);
		    statement += "Added amount "+dep+" \n";
	 }
	 void makeWithdrawal(double wit) {
		    System.out.println("----Withdrawal----");
		    if(acc_type == "checking" && wit<5000)
		    	balance = balance-wit;
		    else if(acc_type=="savings" && wit<balance)
		    	balance = balance-wit;
		    else
		    	balance = balance-wit;
		    System.out.println("Amount Withdrawn"+wit);
		    System.out.println("Current Balance"+balance);
		    statement += "Withdrew amount "+wit+" \n";

	 }
	 void checkBalance() {
		    System.out.println("----Balance----");
		    System.out.println("Your account balance is "+balance+"\n ");

	 }
	 void printStatement() {
		    System.out.println("----Bank Statement----");
		    System.out.println("Bank account no. "+account_no);
		    System.out.println("Customer name " +obj.get(i).name +"\nCustomer Address "+
		    obj.get(i).address+"\nCustomer Phone no. "+obj.get(i).phone_no+"\nAccount type "+acc_type+"\n");
		    
		    System.out.println(statement);

	 }
	 void calculateZakat() {

		 double zakat = 0;
		    System.out.println("----Zakat Calculation----");
		    if(acc_type == "savings" && balance>20000) {
		    	zakat = (balance * 2.5)/100;
		    }
		    System.out.println("Zakat is "+zakat);
		    System.out.println("Do you want to pay Zakat(y/n)\n");
		    char opt = scanner.next().charAt(0);
		    if(opt == 'y') {
		    	balance = balance - zakat;
			    System.out.println("Zakat paid...\n");

		    }
		    
		   	
		    
		    
	 }
	 void displayAllDeductions() {
		    System.out.println("----All Deductions----");
		    System.out.println(deductions);

	 }
	 
	 void displayalldetails() {
		    System.out.println(i);

		    System.out.println("----Account details----");
		    System.out.println("Bank account no. "+account_no);
		    System.out.println(i);
		    System.out.println("Customer name " +obj.get(i).name+"\nCustomer Address "+
		    obj.get(i).address+"\nCustomer Phone no. "+obj.get(i).phone_no+"\nAccount type "+acc_type+"\nBank Balance: "+balance+"\n");
		    
		 
		 
	 }
	 
	 void transfermoney() {
		    
		    		    
		 
	 }
}
