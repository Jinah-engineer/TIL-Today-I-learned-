package chapter15.sec04.exam03_properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		// Properties 객체 생성
		Properties properties = new Properties();
		
		// classPath를 이용해서 properties 객체 생성
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		
		// 프로퍼티 파일 읽기
		properties.load(new FileReader(path));
		
		// 프로퍼티 객체에서 키 값 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		
		
		
	}
}
