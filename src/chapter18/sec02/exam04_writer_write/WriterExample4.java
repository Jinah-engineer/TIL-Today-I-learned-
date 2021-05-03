package chapter18.sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample4 {
	public static void main(String[] args) throws Exception{
		// write(String str) 와 write(String str, int off, int len) 메소드
		Writer writer = new FileWriter("C:\\Temp/text.txt");

		String data = "안녕 자바 프로그램";
//		writer.write(data);
		
		writer.write(data, 3, 2);
		
		writer.flush();
		writer.close(); 
		
		
	}
}
