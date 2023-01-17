package com.example.accessExample;

public class Main {
	public static void main(String[] args) {
		Account myAcc = new Account("Lol");
		myAcc.deposit(1000);
		myAcc.withdraw(500);
		myAcc.calculateBalance();
		System.out.println(myAcc.getBalance());
	}
}
