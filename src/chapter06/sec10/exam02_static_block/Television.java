package chapter06.sec10.exam02_static_block;

public class Television {
	// field
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int from1To10Sum;
	
	// static block
	static {
		info = company + "-" + model;
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		from1To10Sum = sum;
	}
	
}
