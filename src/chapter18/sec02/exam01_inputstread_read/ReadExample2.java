package chapter18.sec02.exam01_inputstread_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:\\Temp/text.txt");
		
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		
//		while( (readByteNo = is.read(readBytes)) != -1 ) {
//			System.out.println(readByteNo);
//		}
		
		while (true) {
			readByteNo = is.read(readBytes);
			if (readByteNo == -1) {
				 break;
			}
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data );
		
		is.close();
	}
}
