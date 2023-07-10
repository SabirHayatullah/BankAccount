
public class BankAccount {
	double balance;
	public BankAccount(double num) {
		balance = num;
	}
	public BankAccount(String str) {
		balance = Double.parseDouble(str);
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void deposit(String str) {
		balance += Double.parseDouble(str);
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void withdraw(String str) {
		balance = Double.parseDouble(str);
	}
	public void setBalance(double amount) {
		balance = amount;
	}
	public void setBalance(String str) {
		balance = Double.parseDouble(str);
	}
	public double getBalance() {
		return balance;
	}
}


