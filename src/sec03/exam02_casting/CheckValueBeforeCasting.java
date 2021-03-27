package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;
		
	//  if (i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) 와 같다.
		if (i<-128 || i>127) { // 2조건 중 하나라도 true면 true!
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		} else { 
			byte b = (byte) i;
			System.out.println(b);
		}
		
		
		
//		byte b = i; --> compile error
//		byte b = (byte) i; // 128은 byte 범위를 초과하는 값
//		System.out.println(b); // 엉뚱한 값이 출력된다. 
		
		// 따라서 값이 유지될 수 있는지를 먼저 검사해야 한다. 
		
	}

}
