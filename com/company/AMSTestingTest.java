package com.company;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;

import org.junit.runners.MethodSorters;

import junit.framework.Assert;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AMSTestingTest extends Main {

	public static List<Account> acc = new ArrayList<Account>();
	public static int p=-1;
	
	
	@Test
	//@Order(1)
	public void atestTestcreate() {
		p++;
		String returnname = CreateAccount(acc,"Ali","F11/2","030303030","checking");
		
		assertEquals("Ali", returnname);	}

	@Test
//	@Order(2)
	public void btestTestlogin() {
			int rees = Login(acc.get(p).account_no,acc,p);
			assertEquals(p, 0);	

			
		}

	
	@Test
	//@Order(1)
	public void ctestTestdeposit() {
		double expected = 1000;
		

		double res=acc.get(p).makeDeposit(1000);
		assertEquals(expected, res);	}

	@Test
	//@Order(2)
	public void dtestTestwithdrawl() {
		double expected = 700;
		System.out.println(p);
		
		 double rees= acc.get(p).makeWithdrawal(300);
		 System.out.println(rees);
		assertEquals(expected, rees);
	}

	@Test
	//@Order(3)
	public void etestTestcheckbalance() {
		 System.out.println("testTestcheckbalance");

		double expected = 700;
		System.out.println(p);
		
		 double rees= acc.get(p).checkBalance();
		 System.out.println(rees);
		assertEquals(expected, rees);	
		}
	
	@Test
	//@Order(4)
	public void ftestTestcalculatezakat() {
		double expected = 0;
		System.out.println(p);
		
		 double rees= acc.get(p).calculateZakat();
		 System.out.println(rees);

		assertEquals(expected, rees);	
		}	

	@Test
//	@Order(5)
	public void gtestTestdisplaydetails() {
		System.out.println("testTestdisplaydetails");

		String expected ="\nCustomer name Ali\nCustomer Address F11/2\nCustomer Phone no. 030303030\nAccount type checking\nBank Balance: 700.0\n";	
		System.out.println(p);
		
		 String rees= acc.get(p).displayalldetails();
		 
		assertEquals(expected, rees);	
		}
	 
	@Test
//	@Order(6)
	public void htestTestPrintstatement() {
		System.out.println("----testTestprintstatement----");

		String expected ="Added amount 1000.0\nWithdrew amount 300.0\n";	
		System.out.println(p);
		
		 String rees= acc.get(p).printStatement();
		 System.out.println(rees);
		assertEquals(expected, rees);	
		}

	@Test
//	@Order(6)
	public void htestTestPrintstatementfalse() {
		System.out.println("----testTestprintstatement----");

		String expected ="Added amount 1000.0 \nWithdrew amount 300.0\n";	
		System.out.println(p);
		
		 String rees= acc.get(p).printStatement();
		 System.out.println(rees);
		Assert.assertFalse(expected==rees);	
		}

	@Test
//	@Order(6)
	public void itestTestdeductions() {
		System.out.println("----testTestdeductions----");

		double  expected =0;	
		System.out.println(p); 
		
		 double rees= acc.get(p).displayAllDeductions();
		 System.out.println(rees);
		assertEquals(expected, rees);	
		}
	
	@Test
	public void jtestTesttransfer() {
		 System.out.println("----jtestTesttransfer----");

		p++;
		CreateAccount(acc,"Akram","F10","0404040","savings");
		 System.out.println(acc.get(0).account_no);

		 System.out.println("\n"+p+"\n");

		double ret = transfermoney(acc,acc.get(0).account_no,200,p);
		 System.out.println("\n"+ret+"\n");

		assertEquals(200, ret);	

		
		
	
	}
	
	@Test
	public void jtestTesttransferfalse() {
		 System.out.println("----jtestTesttransfer----");

		p++;
		CreateAccount(acc,"Akram","F10","0404040","savings");
		 System.out.println(acc.get(0).account_no);

		 System.out.println("\n"+p+"\n");

		double ret = transfermoney(acc,acc.get(0).account_no,200,p);
		 System.out.println("\n"+ret+"\n");

		Assert.assertFalse(ret==456);	

		
		
	
	}

	
}

