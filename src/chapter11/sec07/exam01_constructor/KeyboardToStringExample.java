package chapter11.sec07.exam01_constructor;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException { // jvm에게 예외떠넘기기

		// 키보드로부터 읽은 바이트 배열을 문자열로 변환하기
		byte[] bytes = new byte[100];
		
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);
	}
}
