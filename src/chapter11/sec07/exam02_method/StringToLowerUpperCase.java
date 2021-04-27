package chapter11.sec07.exam02_method;

public class StringToLowerUpperCase {
	public static void main(String[] args) {
		
		// toLowerCase , toUpperCase
		String str1 = "java programming";
		String str2 = "JAVA PROGRAMMING";
		
		System.out.println(str1.equals(str2));  //  false - 대소문자가 다르기때문에 각각 다른 문자열로 인식함
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // true
		
		System.out.println(str1.equalsIgnoreCase(str2)); // true
	}
}
