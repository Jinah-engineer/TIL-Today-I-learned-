package chapter07.sec07.exam01_enum;

public class EnumMethodExample {
	public static void main(String[] args) {
		
		Week today = Week.SUNDAY;
		
		String name = today.name(); // 열거 객체가 참조하는 문자열 리턴
		System.out.println(name);
		
		int ordinal = today.ordinal(); // 열거 상수에 선언을 한 순번
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENDESDAY;
		
		int result1 = day1.compareTo(day2); // 0 - 2
		System.out.println(result1);
		
		int result2 = day2.compareTo(day1); // 2 - 0
		System.out.println(result2);
		
		Week weekDay = Week.valueOf("SUNDAY"); // 문자열 sunday와 동일한 문자열을 갖고 있는 열거 객체의 번지를 리턴
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) { // 동일한 참조
			System.out.println("주말이군요 >_< ");
		} else {
			System.out.println("평일이군요...ㅋ");
		}
		
		Week[] days = Week.values(); // 열거 타입의 모든 열거 객체들을 배열로 만들어 리턴 
		// 이 때, 변수에 열거 객체들을 가지고 있는 객체의 번지를 저장한다. 
		for (Week day : days) {
			System.out.println(day);
		}
				
		
		
		
	}
}
