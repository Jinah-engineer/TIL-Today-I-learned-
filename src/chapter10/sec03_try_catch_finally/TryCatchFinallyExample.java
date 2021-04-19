package chapter10.sec03_try_catch_finally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		// 매개값으로 주어진 클래스가 존재하면 -> Class 객체 리턴 nor ClassNotFoundException 발생시킴 (일반예외)
//		Class clazz = Class.forName("java.lang.String2"); // 정적 메소드
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("아이스크림은 매그넘!");
		}
		
		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println("클래스를 찾았습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("아이스크림은 하겐다즈!");
		}
	}
}
