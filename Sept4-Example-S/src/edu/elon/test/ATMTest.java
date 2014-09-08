package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeposit() {
		ATM atm = new ATM(10);
		try{
			atm.deposit(-10.0);
		} catch (IllegalArgumentException expected){
			assertTrue(true);
		}
	}

	@Test
	public void testGetBalance() {
		ATM atm = new ATM(30.0);
		double expected = 30.0;
		double actual = atm.getBalance();
		assertEquals(actual, expected, 0.0);
	}

	@Test
	public void testToString() {
		ATM atm = new ATM(30);
		String expected = "Amount balance is $30.00";
		String actual = atm.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testWithdrawOverdraft() {
		ATM atm = new ATM(30);
		try{
			atm.withdraw(40);
		} catch (IllegalArgumentException expected){
			assertTrue(true);
		}
	}
	
	@Test
	public void testWithdrawNegative() {
		ATM atm = new ATM(30);
		try{
			atm.withdraw(-10.0);
		} catch (IllegalArgumentException expected){
			assertTrue(true);
		}
	}

}
