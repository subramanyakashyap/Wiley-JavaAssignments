package com.bankImpl;

public class MyAccount {

	public static void main(String[] args) {
		SavingsAcc savings = new SavingsAcc();
		FDAcc fd = new FDAcc();
		PersonalLoanAcc personalLoan = new PersonalLoanAcc();
		HousingLoanAcc housingLoan = new HousingLoanAcc();
		System.out.println("====SAVINGS ACCOUNT====");
		savings.createAcc();
		savings.deposit();
		savings.withdraw();
		savings.calcInt();
		savings.addAnnualInt();
		savings.addHalfYrlyInt();
		savings.addMonthlyInt();
		savings.getBalance();
		System.out.println("====FIXED DEPOSIT ACCOUNT====");
		fd.createAcc();
		fd.deposit();
		fd.withdraw();
		fd.calcInt();
		fd.addAnnualInt();
		fd.addHalfYrlyInt();
		fd.addMonthlyInt();
		fd.getBalance();
		System.out.println("====PERSONAL LOAN ACCOUNT====");
		personalLoan.createAcc();
		personalLoan.calcInt();
		personalLoan.deductAnnualInt();
		personalLoan.deductHalfYrlyInt();
		personalLoan.deductMonthlyInt();
		personalLoan.payInterest();
		personalLoan.payPartialPrincipal();
		personalLoan.repayPrincipal();
		System.out.println("====SAVUSING LOAN ACCOUNT====");
		housingLoan.createAcc();
		housingLoan.calcInt();
		housingLoan.deductAnnualInt();
		housingLoan.deductHalfYrlyInt();
		housingLoan.deductMonthlyInt();
		housingLoan.payInterest();
		housingLoan.payPartialPrincipal();
		housingLoan.repayPrincipal();
	}

}
