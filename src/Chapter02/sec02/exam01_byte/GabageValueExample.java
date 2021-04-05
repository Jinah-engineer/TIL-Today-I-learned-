package Chapter02.sec02.exam01_byte;

public class GabageValueExample {

	public static void main(String[] args) {
		
		byte var1 = 125;
//		var1++; // var1에 1을 플러스 하겠다라는 의미
//		System.out.println(var1);
//		
//		var1++;
//		System.out.println(var1);
//		
//		var1++;
//		System.out.println(var1);
//		
		
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2 );
		}
	}

}
