package com.bankImpl;

import com.bank.CreditInterest;
import com.bank.DepositAcc;

public class SavingsAcc implements DepositAcc, CreditInterest {

	@Override
	public void createAcc() {
		System.out.println("Savings account created");
		
	}

	@Override
	public void calcInt() {
		System.out.println("Savings Interest calculated");
		
	}

	@Override
	public void addMonthlyInt() {
		System.out.println("Monthly interest added to Savings account");
		
	}

	@Override
	public void addHalfYrlyInt() {
		System.out.println("Half yearly interest is added to Savings account");
		
	}

	@Override
	public void addAnnualInt() {
		System.out.println("Annual interest is added to Savings account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Savings account withdrawed");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit to Savings account");
		
	}

	@Override
	public void getBalance() {
		System.out.println("Balance of Savings account");
		
	}
	
}
