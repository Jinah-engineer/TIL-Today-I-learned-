
package chapter18.sec02.exam01_inputstread_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:\\Temp/text.txt");
		
		int readByteNo;
		byte[] readBytes = new byte[8];
		
		readByteNo = is.read(readBytes, 2, 3);
		
		for(int i = 0; i < readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		
		is.close();
	}
}
