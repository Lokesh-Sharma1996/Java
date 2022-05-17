package com.javatraining.oca.exercise4_1.system;

import com.javatraining.oca.exercise4_1.records.Account;

abstract public class BankDatabase {

	abstract public void deposite(double amount);
	abstract public void withDraw(double amount);
	abstract protected double getBalance();
	final void transfer(Account from, Account to, double amount) {
		from.withDraw(amount);
		to.deposite(amount);
	}
}
