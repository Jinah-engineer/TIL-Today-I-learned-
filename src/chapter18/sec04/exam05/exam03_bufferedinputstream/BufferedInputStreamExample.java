package chapter18.sec04.exam05.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {

		// BufferedInputStream 
		long start = 0;
		long end = 0;

		String path = "src/chapter18/sec04/exam05/exam03_bufferedinputstream/BufferedInputStreamExample.java";
		FileInputStream fis1 = new FileInputStream(path);

		start = System.currentTimeMillis();

		while (fis1.read() != -1) {}

		end = System.currentTimeMillis();

		System.out.println("사용하지 않았을 때 : " + (end - start) + "ms");

		fis1.close();
		
		// buffer 사용

		FileInputStream fis2 = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis2);

		start = System.currentTimeMillis();

		while (bis.read() != -1) {}

		end = System.currentTimeMillis();

		System.out.println("사용했을 때 : " + (end - start) + "ms");

		fis2.close();
		bis.close();
	}
}
