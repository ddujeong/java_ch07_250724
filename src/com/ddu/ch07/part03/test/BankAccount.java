
	package com.ddu.ch07.part03.test;

	public class BankAccount {
		private double balance;

		public BankAccount() {
			super();
			// TODO Auto-generated constructor stub
		}

		public BankAccount(double balance) {
			super();
			this.balance = balance;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			if (balance> 0) {
			this.balance = balance;
			}
		}
		
}
