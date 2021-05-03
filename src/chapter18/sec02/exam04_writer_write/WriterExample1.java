package chapter18.sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample1 {
	public static void main(String[] args) throws Exception{
		// Writer
		Writer writer = new FileWriter("C:\\Temp/text.txt");
		
		char[] data = "홍길동".toCharArray(); // char 배열 얻기
		
		for (int i = 0; i< data.length; i++) {
			writer.write(data[i]);
		}
		
		writer.flush();
		writer.close();
		
		
	}
}
