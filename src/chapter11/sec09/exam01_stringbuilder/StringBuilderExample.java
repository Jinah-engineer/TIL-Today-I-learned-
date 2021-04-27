package chapter11.sec09.exam01_stringbuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		
	// StringBuilder는 java.lang.package에 있기 때문에 따로 import가 필요없다
	StringBuilder sb = new StringBuilder();
	
	// append -  문자열 끝에 주어진 매개값을 추가
	sb.append("Java");
	sb.append("Program study");
	
	System.out.println(sb.toString());
	
	// insert - 문자열 중간에 주어진 매개값을 추가
	sb.insert(4, 2); // index 위치 + 넣을 값 
	System.out.println(sb.toString());
	
	// setCharAt(int indext, char ch) - 문자열에서 주어진 index의 문자를 다른 문자로 대치
	sb.setCharAt(4, '6');
	System.out.println(sb.toString());
	
	// replace(int start, int end, String str)
	sb.replace(6, 13, "Book");
	System.out.println(sb.toString());
	
	// delete(int start, int end) - 문자열의 일부분 삭제
	sb.delete(4, 5);
	System.out.println(sb.toString());
	
	int length = sb.length();
	System.out.println("총 문자 수: " + length);
	
	String result = sb.toString();
	System.out.println(result);
	
	
	
	
	}
}
