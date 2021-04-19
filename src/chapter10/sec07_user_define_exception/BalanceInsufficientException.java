package chapter10.sec07_user_define_exception;

public class BalanceInsufficientException extends Exception{
	// constructor
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
	
	
}
