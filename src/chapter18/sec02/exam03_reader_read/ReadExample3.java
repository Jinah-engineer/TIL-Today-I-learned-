
package chapter18.sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		// read(char[] cbuf, int off, int len) method
		Reader reader = new FileReader("C:\\Temp/text.txt");
		
		int readCharNo;
		char[] cbuf = new char[4];
		readCharNo = reader.read(cbuf, 1, 2);
		
		for (int i = 0; i < cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		
		reader.close();
		
	}
}
