package com.company;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class AMSTesting {
	
	public static List<Account> acc = new ArrayList<Account>();
	public static int i=-1;
	
	@Before
	public void setUp() {
		
		
	}
	
	
	@Test
	@Order(1)
	public void testdeposit() {
		
		double expected = 1000;
		i++;
		acc.add(new Account("Ali","F11/2","030303030","checking"));
		
		double res=acc.get(i).makeDeposit(1000);
		assertEquals(expected, res);
	}
	
	@Test
	@Order(2)
	public void testwithdrawl() {
		
		double expected = 700;
		System.out.println(i);
		
		 double rees= acc.get(i).makeWithdrawal(300);
		 System.out.println(rees);
		assertEquals(expected, rees);
	}

	@Test
	@Order(3)
	public void testcheckbalance() {
		
		
	}


}



