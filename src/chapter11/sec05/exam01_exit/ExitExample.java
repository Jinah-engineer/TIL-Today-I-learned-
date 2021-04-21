package chapter11.sec05.exam01_exit;

public class ExitExample {
	public static void main(String[] args) {

		// 보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			// checkExit 정상실행되면 종료되므로, 정상실행이 안되게끔 예외를 던져주는 것
			@Override
			public void checkExit(int status) {
				if (status != 5) { 
					throw new SecurityException();
				}
			}
		});


		for(int i = 0; i < 10; i++)	{
			System.out.println(i);
			try {
				System.exit(i);
			} catch (SecurityException e) {}
		}
	}
}
