package com.bankImpl;

import com.bank.DebitInterest;
import com.bank.LoanAcc;

public class PersonalLoanAcc implements LoanAcc, DebitInterest {

	@Override
	public void createAcc() {
		System.out.println("Personal loan account created");
		
	}

	@Override
	public void calcInt() {
		System.out.println("Interest of personal loan account calculated");
		
	}

	@Override
	public void deductMonthlyInt() {
		System.out.println("Monthly interest deducted from personal load account");
		
	}

	@Override
	public void deductHalfYrlyInt() {
		System.out.println("Half yearly interest deducted from the personal loan account");
		
	}

	@Override
	public void deductAnnualInt() {
		System.out.println("Annual interest deducted from the personal loan account");
		
	}

	@Override
	public void repayPrincipal() {
		System.out.println("Personal loan account principal repaid");
		
	}

	@Override
	public void payInterest() {
		System.out.println("Personal loan account interest paid");
		
	}

	@Override
	public void payPartialPrincipal() {
		System.out.println("Personal loan account partial principal is paid");
	}

}
