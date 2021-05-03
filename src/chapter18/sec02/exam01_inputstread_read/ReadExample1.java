package chapter18.sec02.exam01_inputstread_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		
	InputStream is = new FileInputStream("C:\\Temp/text.txt");
	
	int readByte;
	
//	while((readByte = is.read()) != -1) {
//		System.out.println(readByte);
//	}
	
	while(true) {
		readByte = is.read();
		if (readByte == -1) {
			break;
		}
		System.out.println((char)readByte);
	}
	
	is.close();
	}
}
