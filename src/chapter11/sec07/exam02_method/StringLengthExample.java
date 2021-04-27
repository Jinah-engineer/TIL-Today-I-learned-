package chapter11.sec07.exam02_method;

public class StringLengthExample {
	public static void main(String[] args) {
		
		// length
		String ssn = "8394802980498";
		System.out.println(ssn.length());
		
		int length = ssn.length();
	
		
		if (length == 13) {
			System.out.println("주민번호로 사용이 가능합니다.");
		} else {
			System.out.println("주민번호로 못쓰네요 ㅠ_ㅠ");
		}
	}
}
