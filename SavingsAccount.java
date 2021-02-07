package com.techelevator;

public class SavingsAccount extends BankAccount {
	// Constructors
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	// Methods
		public int withdraw(int amountToWithdraw) {
			if(getBalance() >= amountToWithdraw) {
				super.withdraw(amountToWithdraw);
				if(getBalance() < 150) {
					super.withdraw(2);
				}
			}
			return getBalance();
		}

		
}
