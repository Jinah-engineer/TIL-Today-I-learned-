package chapter06.sec07.exam02_field_initialize;

public class KoreanExample {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.nation : " + k1.nation);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "940525-909009");
		System.out.println("k2.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
			
	}
}
