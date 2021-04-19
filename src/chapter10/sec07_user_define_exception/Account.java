package chapter10.sec07_user_define_exception;

public class Account {
	// field
	private long balance;
	
	// constructor
	public Account() {}
	
	// method
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족 : " + (money - balance) + " 부족하여 예외가 발생");
		}
		balance -= money;
	}
}
