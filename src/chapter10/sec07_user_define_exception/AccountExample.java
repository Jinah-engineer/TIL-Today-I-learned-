package chapter10.sec07_user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(30000);
			System.out.println("예금액 : " + account.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			System.out.println(e.toString()); // 간단하게 출력
			System.out.println();
			e.printStackTrace(); // 예외 처리 코드이기 보다 console에 출력할 목적 (개발자를 위한 코드) 개발 이후에 주석처리를 하거나 빼야한다.
		}
	}
}
