package chapter13.sec05.exam01_bounded_type;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		
//		int result1 = Util.compare("a", "B"); (x)
		// int -> Integer (auto Boxing)
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		// double -> Double (auto Boxing)
		int result2 = Util.compare(3.4, 3);
		System.out.println(result2);
		
	}
}
