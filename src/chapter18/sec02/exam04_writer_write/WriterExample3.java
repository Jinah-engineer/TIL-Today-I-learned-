package chapter18.sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample3 {
	public static void main(String[] args) throws Exception{
		// write(char[]	cbuf) method
		// 앞에 예제보다 좀 더 효율적인 코드라고 할 수 있다.
		Writer writer = new FileWriter("C:\\Temp/text.txt");
		
		char[] data = "홍길동".toCharArray();
		
		writer.write(data, 1, 2);
		
		writer.flush();
		writer.close();
		
		
		
	}
}
