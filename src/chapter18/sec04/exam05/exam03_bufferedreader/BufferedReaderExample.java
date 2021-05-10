package chapter18.sec04.exam05.exam03_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {
	
		// BufferedReader
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is); // 바이트 기반 스트림을 문자 기반 스트림으로 변환
		BufferedReader br = new BufferedReader(reader); // 문자 기반 스트림에 버퍼를 제공
		
		System.out.println("입력 : ");
		String lineString = br.readLine();
		
		System.out.println("출력 : " + lineString);
		
		br.close();
		reader.close();
		is.close();
		
		
	
	}
}
