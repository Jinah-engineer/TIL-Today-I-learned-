package chapter11.sec07.exam01_constructor;

public class ByteToStringExample {
	public static void main(String[] args) {
		
		// 배열 전체를 String 객체로 생성
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1); // Hello Java
		
	}
}
