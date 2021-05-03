package chapter18.sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		// read() method
		Reader reader = new FileReader("C:\\Temp/text.txt");
		
		int readData;
		
//		while ((readData = reader.read()) != -1) {
//			System.out.print((char) readData); // int를 char로 변환하여 읽은 문자 얻기
//		}

		while (true) {
			readData = reader.read();
			if (readData == -1) {
				break;
			}
			System.out.print((char) readData);
		}
	}
}
