package chapter11.sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		// Car 객체 생성
		Car car = new Car();
		Class clazz1 = car.getClass(); // Car Class의 객체 얻기
		
		System.out.println(clazz1.getName()); // package명을 포함한 class 전체 name을 얻을 수 있다.
		System.out.println(clazz1.getSimpleName()); // class name 만
		System.out.println(clazz1.getPackage().getName()); // package 이름만
		
		System.out.println();
		
		// 문자열로부터 Class 객체 얻기 (예외 처리 필요)
		try {
			Class clazz2 = Class.forName("chapter11.sec06.exam01_class.Car");
			System.out.println(clazz2.getName()); // package명을 포함한 class 전체 name을 얻을 수 있다.
			System.out.println(clazz2.getSimpleName()); // class name 만
			System.out.println(clazz2.getPackage().getName()); // package 이름만
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
