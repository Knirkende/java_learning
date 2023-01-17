package com.example.accessExample;

import java.util.ArrayList;

public class Account {
	private String accountName;
	private int balance = 0;
	private ArrayList<Integer> transactions;
	
	public Account(String accountName) {
		this.accountName = accountName;
		this.transactions = new ArrayList<Integer>();
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		if (amount > 0) {
			transactions.add(amount);
			this.balance += amount;
			System.out.println(amount + " added. New balance: " + this.balance);
		} else {
			System.out.println("Smaller than zero deposit.");
		}
	}
	
	public void withdraw(int amount) {
		int withdrawal = -amount;
		if (withdrawal < 0) {
			this.transactions.add(withdrawal);
			this.balance += withdrawal;
			System.out.println(amount + " subtracted. New balance: " + this.balance);
		} else {
			System.out.println("Smaller than zero withdrawal.");
		}
	}
	public void calculateBalance() {
		this.balance = 0;
		for (int i : this.transactions) {
			this.balance += i;
		}
		System.out.println("Calculated balance: " + this.balance);
	}
	
}
