package chapter18.sec04.exam02_fileinputstream;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) throws Exception {
		
		// FileInputStream
		String file = "src/chapter18/sec04/exam02_fileinputstream/FileInputStreamExample.java";
		FileInputStream fis = new FileInputStream(file);
		
		int data;
		while ( (data = fis.read()) != -1) {
			System.out.write(data);
		}
		fis.close();
	}
}
