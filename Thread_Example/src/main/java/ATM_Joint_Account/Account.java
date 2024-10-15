package ATM_Joint_Account;

public class Account {
private int balance=6000;

public int getBalance() {
	return balance;
}

public void amountWithdrawn(int amount) {
	this.balance = balance-amount;
}
}
