/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 7.6
 *****************************************************************************/
package seventh.assignment;

import java.text.NumberFormat;

//Account class with getter and setter methods for account holders and transactions.
public class AccountName {
	private final double RATE = 0.03; // interest rate of 3.0%
	private String name;
	private long acctNumber;
	private double balance;

	public AccountName(String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}

	public double deposit(double amount) {
		if (amount > 0)
			balance = balance + amount;
		return balance;
	}

	public double withdraw(double amount, double fee) {
		if (amount + fee > 0 && amount + fee < balance)
			balance = balance - amount - fee;
		return balance;
	}

	public double addInterest() {
		balance += (balance * RATE);
		return balance;
	}

	public double getbalance() {
		return balance;
	}

	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	}

}
