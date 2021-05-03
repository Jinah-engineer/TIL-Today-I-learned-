package chapter18.sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		// read(char[] cbuf) method
		Reader reader = new FileReader("C:\\Temp/text.txt");
		
		int readCharNo;
		
		char[] cbuf = new char[2];
		String data = "";
		
//		while( (readCharNo = reader.read(cbuf)) != -1) {
//			data += new String(cbuf, 0, readCharNo);
//		}
		
		while (true) {
			readCharNo = reader.read(cbuf);
			if (readCharNo == -1) {
				break;
			}
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
	}
}
