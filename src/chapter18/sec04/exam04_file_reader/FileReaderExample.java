package chapter18.sec04.exam04_file_reader;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		// FileReader
		String file = "src/chapter18/sec04/exam04_file_reader/FileReaderExample.java";
		FileReader fr = new FileReader(file);
		
		int readCharNo;
		char[] cbuf = new char[100];
		
		while ( (readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		fr.close();
	}
}
