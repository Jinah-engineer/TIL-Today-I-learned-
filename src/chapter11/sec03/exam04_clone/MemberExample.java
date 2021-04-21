package chapter11.sec03.exam04_clone;

public class MemberExample {
	public static void main(String[] args) {
		// 원본 객체 생성
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		// 복제 객체를 얻은 후에 패스워드 변경 (얕은 복제) 
		Member cloned1 = original.getMember();
		cloned1.password = "123";
		
		
		System.out.println(cloned1.id)
		
		;
	}
}
