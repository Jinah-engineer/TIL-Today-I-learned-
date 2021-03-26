package sec02.exam02_long;

public class LongExample {
	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L; // 컴퓨터는 'L'을 확인함으로써 4byte가 아니라 8byte로 해석해야함을 인식한다
		
		long var3 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		
	}
}
