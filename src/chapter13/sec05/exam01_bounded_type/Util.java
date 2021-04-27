package chapter13.sec05.exam01_bounded_type;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue(); // t1을 가지고 사용할 수 있는 메소드 --> Number에 있는 메소드만!
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
