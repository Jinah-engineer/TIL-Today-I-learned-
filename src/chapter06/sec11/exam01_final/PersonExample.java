package chapter06.sec11.exam01_final;

public class PersonExample {
	public static void main(String[] args) {
		
		Person p1 = new Person("1234567-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa"; --> compile error
		p1.name = "을지문덕"; // 일반 field는 변경 가능
	}
}
