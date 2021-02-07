package com.techelevator;

public class CheckingAccount extends BankAccount{

	// Constructors
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	// Methods
	@Override 
	public int withdraw(int amountToWithdraw) {
		if(getBalance() - amountToWithdraw > -100) {
			super.withdraw(amountToWithdraw);

			if(getBalance() < 0 && getBalance() > -100) {
				super.withdraw(10);
			}
		}
		
		return getBalance();
	}

	


}
