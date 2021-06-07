package com.bankImpl;

import com.bank.DebitInterest;
import com.bank.LoanAcc;

public class HousingLoanAcc implements LoanAcc, DebitInterest {
	@Override
	public void createAcc(){
		System.out.println("Housing loan account created");
	}

	@Override
	public void calcInt() {
		System.out.println("Interest calculated in Housing loan account");
	}

	@Override
	public void deductMonthlyInt() {
		
		System.out.println("Monthly interest deducted of housing loan account");
	}

	@Override
	public void deductHalfYrlyInt() {
		System.out.println("Half yearly interest deducted of housing loan account");
	}

	@Override
	public void deductAnnualInt() {
		System.out.println("Annual interest deducted of housing loan account");
	}

	@Override
	public void repayPrincipal() {
		System.out.println("Principal amount repaid(Housing loan account)");
		
	}

	@Override
	public void payInterest() {
		System.out.println("Interest Paid(Housing loan account)");
		
	}

	@Override
	public void payPartialPrincipal() {
		System.out.println("Partial principal paid(Housing loan account)");
		
	}

}
