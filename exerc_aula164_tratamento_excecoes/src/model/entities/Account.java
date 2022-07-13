package model.entities;

import model.exception.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account () {
		super();
	}

	public Account(Integer number, String holder, Double withdrawLimit, Double balance) {
		this.number = number;
		this.holder = holder;
		this.withdrawLimit = withdrawLimit;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit (double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws DomainException {
		if(amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		else if(amount > balance) {
			throw new DomainException("Not enough balance");
		}else {
			balance -= amount;
		}
	}
	
	public String toString() {
		return "New balance: " + String.format("%.2f", balance);
	}
	
	
}
