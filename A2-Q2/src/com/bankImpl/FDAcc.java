package com.bankImpl;

import com.bank.CreditInterest;
import com.bank.DepositAcc;

public class FDAcc implements DepositAcc, CreditInterest {

	@Override
	public void createAcc() {
		System.out.println("FD account created");
		
	}

	@Override
	public void calcInt() {
		System.out.println("FD Interest calculated");
		
	}

	@Override
	public void addMonthlyInt() {
		System.out.println("Monthly interest added to FD account");
		
	}

	@Override
	public void addHalfYrlyInt() {
		System.out.println("Half yearly interest is added to FD account");
		
	}

	@Override
	public void addAnnualInt() {
		System.out.println("Annual interest is added to FD account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("FD account withdrawed");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit to FD account");
		
	}

	@Override
	public void getBalance() {
		System.out.println("Balance of FD account");
		
	}
	
	

}
